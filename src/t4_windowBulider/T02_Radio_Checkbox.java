package t4_windowBulider;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class T02_Radio_Checkbox {

	private JFrame frame;
	private final JLabel lblNewLabel = new JLabel("라디오버튼/체크박스 연습");
	private final ButtonGroup buttonGroup = new ButtonGroup();

	
	public static void main(String[] args) {
		new T02_Radio_Checkbox();
				
	}

	
	public T02_Radio_Checkbox() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("라디오/체크박스 연습");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBackground(Color.CYAN);
		pn1.setBounds(0, 0, 784, 104);
		frame.getContentPane().add(pn1);
		pn1.setLayout(null);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(0, 0, 784, 104);
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBackground(Color.WHITE);
		pn2.setBounds(0, 102, 784, 357);
		frame.getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblGender = new JLabel("성 별");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("굴림", Font.BOLD, 20));
		lblGender.setBounds(60, 57, 124, 36);
		pn2.add(lblGender);
		
		JLabel lblHobby = new JLabel("취 미");
		lblHobby.setHorizontalAlignment(SwingConstants.CENTER);
		lblHobby.setFont(new Font("굴림", Font.BOLD, 20));
		lblHobby.setBounds(60, 140, 124, 36);
		pn2.add(lblHobby);
		
		JRadioButton rdMale = new JRadioButton("남 자");
		buttonGroup.add(rdMale);
		rdMale.setBackground(Color.WHITE);
		rdMale.setFont(new Font("굴림", Font.BOLD, 20));
		rdMale.setBounds(230, 64, 121, 23);
		pn2.add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여 자");
		rdFemale.setSelected(true);
		buttonGroup.add(rdFemale);
		rdFemale.setBackground(Color.WHITE);
		rdFemale.setFont(new Font("굴림", Font.BOLD, 20));
		rdFemale.setBounds(396, 66, 121, 23);
		pn2.add(rdFemale);
		
		JCheckBox ckHobby1 = new JCheckBox("등산");
		ckHobby1.setBackground(Color.WHITE);
		ckHobby1.setFont(new Font("굴림", Font.BOLD, 20));
		ckHobby1.setBounds(214, 147, 80, 23);
		pn2.add(ckHobby1);
		
		JCheckBox ckHobby2 = new JCheckBox("낚시");
		ckHobby2.setBackground(Color.WHITE);
		ckHobby2.setFont(new Font("굴림", Font.BOLD, 20));
		ckHobby2.setBounds(331, 149, 80, 23);
		pn2.add(ckHobby2);
		
		JCheckBox ckHobby3 = new JCheckBox("수영");
		ckHobby3.setBackground(Color.WHITE);
		ckHobby3.setFont(new Font("굴림", Font.BOLD, 20));
		ckHobby3.setBounds(437, 149, 80, 23);
		pn2.add(ckHobby3);
		
		JCheckBox ckHobby4 = new JCheckBox("바둑");
		ckHobby4.setBackground(Color.WHITE);
		ckHobby4.setFont(new Font("굴림", Font.BOLD, 20));
		ckHobby4.setBounds(539, 149, 80, 23);
		pn2.add(ckHobby4);
		
		JCheckBox ckHobby5 = new JCheckBox("바이크");
		ckHobby5.setBackground(Color.WHITE);
		ckHobby5.setFont(new Font("굴림", Font.BOLD, 20));
		ckHobby5.setBounds(644, 149, 92, 23);
		pn2.add(ckHobby5);
		
		JLabel lblMessage = new JLabel("메세지가 출력 됩니다.");
		lblMessage.setFont(new Font("굴림", Font.BOLD, 20));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(30, 208, 729, 116);
		pn2.add(lblMessage);
		
		JPanel pn3 = new JPanel();
		pn3.setBackground(Color.PINK);
		pn3.setBounds(10, 457, 784, 104);
		frame.getContentPane().add(pn3);
		pn3.setLayout(null);
		
		JButton btnGender = new JButton("성별출력");
		btnGender.setFont(new Font("굴림", Font.BOLD, 20));
		btnGender.setBounds(75, 42, 161, 36);
		pn3.add(btnGender);
		
		JButton btnHobby = new JButton("취미출력");
		btnHobby.setFont(new Font("굴림", Font.BOLD, 20));
		btnHobby.setBounds(311, 42, 161, 36);
		pn3.add(btnHobby);
		
		JButton btnExit = new JButton("종 료");
		btnExit.setFont(new Font("굴림", Font.BOLD, 20));
		btnExit.setBounds(547, 42, 161, 36);
		pn3.add(btnExit);
		
		frame.setVisible(true);
		
		// -----------------------위쪽은 디자인, 아래쪽은 메소드-------------------------------------------
		
		// 취미 출력버튼 클릭시 수행
		btnHobby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hobby = "선택하신 취미는? ";
				if(ckHobby1.isSelected()) hobby += ckHobby1.getText() + "/";
				if(ckHobby2.isSelected()) hobby += ckHobby2.getText() + "/";
				if(ckHobby3.isSelected()) hobby += ckHobby3.getText() + "/";
				if(ckHobby4.isSelected()) hobby += ckHobby4.getText() + "/";
				if(ckHobby5.isSelected()) hobby += ckHobby5.getText() + "/";
				
				hobby = hobby.substring(0,hobby.length()-1);
				
				lblMessage.setText(hobby);
			}
		});
		
		// 성별 출력버튼 클릭시 수행
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender = "선택하신 성별은? ";
				if(rdMale.isSelected()) gender += rdMale.getText();
				else gender += rdFemale.getText();
				
				lblMessage.setText(gender);
			}
		});
		
		// 종료버튼을 마우스로 클릭시 수행
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = JOptionPane.showConfirmDialog (frame, "작업을 종료할까요?", "작업종료", JOptionPane.YES_NO_OPTION); //confirm은 물어보는거 메세지는 출력하는거 / frame을 넣으면 이동해도 부모 중간에
				if(ans == 0) System.exit(0);
			}
		});
		
	}
}
