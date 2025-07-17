package t4_windowBulider;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class T01_Basic {

	private JFrame frame;
	private JTextField txtMid;
	private JPasswordField txtPwd;
	private JTextField txtName;
	private JTextField txtAge;

	public static void main(String[] args) {
		new T01_Basic();
	}

	public T01_Basic() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		//frame.setBounds(100, 100, 802, 609);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null); // absolute 레이아웃
		
		JButton btnExit = new JButton("작업종료");
		
		btnExit.setFont(new Font("HY엽서M", Font.PLAIN, 12));
		btnExit.setBounds(538, 481, 200, 40);
		frame.getContentPane().add(btnExit); // content 위에 프레임을 쓴다
		
		JButton btnretry = new JButton("다시입력");
		btnretry.setFont(new Font("HY엽서M", Font.PLAIN, 12));
		btnretry.setBounds(286, 481, 200, 40);
		frame.getContentPane().add(btnretry);
		
		JButton btnid = new JButton("회원가입");
		
		btnid.setFont(new Font("HY엽서M", Font.PLAIN, 12));
		btnid.setBounds(35, 481, 200, 40);
		frame.getContentPane().add(btnid);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(35, 10, 208, 53);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("성명");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(35, 134, 208, 53);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("나이");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2.setBounds(35, 198, 208, 53);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("비밀번호");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_3.setBounds(35, 73, 208, 53);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtMid = new JTextField();
		txtMid.setFont(new Font("굴림", Font.BOLD, 20));
		txtMid.setBounds(286, 17, 352, 39);
		frame.getContentPane().add(txtMid); 
		txtMid.setColumns(10);
		
		txtPwd = new JPasswordField();
		txtPwd.setBounds(286, 82, 352, 40);
		frame.getContentPane().add(txtPwd);
		
		txtName = new JTextField();
		txtName.setFont(new Font("굴림", Font.BOLD, 20));
		txtName.setColumns(10);
		txtName.setBounds(286, 141, 352, 39);
		frame.getContentPane().add(txtName);
		
		txtAge = new JTextField();
		txtAge.setText("0");
		txtAge.setFont(new Font("굴림", Font.BOLD, 20));
		txtAge.setColumns(10);
		txtAge.setBounds(286, 205, 352, 39);
		frame.getContentPane().add(txtAge);
		
		JLabel lblNewLabel_2_1 = new JLabel("자기소개");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(35, 268, 208, 53);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(286, 268, 352, 175);
		frame.getContentPane().add(scrollPane);
		
		JTextArea txtaContent = new JTextArea();
		scrollPane.setViewportView(txtaContent);
		
		frame.setVisible(true);	
		
//	-------------------------------------위쪽은 디자인, 아래쪽은 메소드-----------------------------------------	
		
		// 종료버튼 클릭시 수행
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnExit.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.exit(0);
			}
		});
		
		// 회원가입버튼 클릭시 수행
		btnid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mid = txtMid.getText();
				String pwd = txtPwd.getText();
				String name = txtName.getText();
				int age = Integer.parseInt(txtAge.getText());
				String content = txtaContent.getText();
				
				if(mid.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디 필수 입력입니다", "회원가입창", JOptionPane.WARNING_MESSAGE);
					txtMid.requestFocus();
				}else if (pwd.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호 필수 입력입니다", "회원가입창", JOptionPane.WARNING_MESSAGE);
					txtPwd.requestFocus();
				}else if(name.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "성명은 필수 입력입니다", "회원가입창", JOptionPane.WARNING_MESSAGE);
					txtName.requestFocus();
				}
				
				JOptionPane.showMessageDialog(null, "회원에 가입합니다", "회원가입", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		
	}
}
