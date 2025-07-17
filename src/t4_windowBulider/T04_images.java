package t4_windowBulider;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class T04_images {
	
	JLabel lblImg1, lblImg2, lblImg3, lblImg4;
	int img1Cnt=0, img2Cnt=0, img3Cnt=0, img4Cnt=0;
	JLabel lblMessage;

	private JFrame frame;

	
	public static void main(String[] args) {
		new T04_images();
					
	}

	
	public T04_images() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("카드횟수맞추기");
		frame.setSize(1000, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 984, 65);
		frame.getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JButton btnTotal = new JButton("모두보기");
		btnTotal.setFont(new Font("굴림", Font.BOLD, 18));
		btnTotal.setBounds(8, 10, 113, 45);
		pn1.add(btnTotal);
		
		JButton btn1 = new JButton("1번보기");
		btn1.setFont(new Font("굴림", Font.BOLD, 18));
		btn1.setBounds(129, 10, 113, 45);
		pn1.add(btn1);
		
		JButton btn2 = new JButton("2번보기");
		btn2.setFont(new Font("굴림", Font.BOLD, 18));
		btn2.setBounds(250, 10, 113, 45);
		pn1.add(btn2);
		
		JButton btn3 = new JButton("3번보기");
		btn3.setFont(new Font("굴림", Font.BOLD, 18));
		btn3.setBounds(371, 10, 113, 45);
		pn1.add(btn3);
		
		JButton btn4 = new JButton("4번보기");
		btn4.setFont(new Font("굴림", Font.BOLD, 18));
		btn4.setBounds(492, 10, 113, 45);
		pn1.add(btn4);
		
		JButton btnRandom = new JButton("랜덤보기");
		btnRandom.setFont(new Font("굴림", Font.BOLD, 18));
		btnRandom.setBounds(613, 10, 113, 45);
		pn1.add(btnRandom);
		
		JButton btnExit = new JButton("종료");
		btnExit.setBounds(855, 10, 113, 45);
		pn1.add(btnExit);
		btnExit.setFont(new Font("굴림", Font.BOLD, 18));
		
		JButton btnClose = new JButton("모두닫기");
		btnClose.setFont(new Font("굴림", Font.BOLD, 18));
		btnClose.setBounds(734, 10, 113, 45);
		pn1.add(btnClose);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 63, 984, 424);
		frame.getContentPane().add(pn2);
		pn2.setLayout(null);
		
		lblImg1 = new JLabel("");
		lblImg1.setIcon(new ImageIcon(T04_images.class.getResource("/t4_windowBulider/images/2.jpg")));
		lblImg1.setBounds(11, 10, 234, 404);
		pn2.add(lblImg1);
		
		lblImg2 = new JLabel("");
		lblImg2.setIcon(new ImageIcon(T04_images.class.getResource("/t4_windowBulider/images/3.jpg")));
		lblImg2.setBounds(256, 10, 234, 404);
		pn2.add(lblImg2);
		
		lblImg3 = new JLabel("");
		lblImg3.setIcon(new ImageIcon(T04_images.class.getResource("/t4_windowBulider/images/1.jpg")));
		lblImg3.setBounds(501, 10, 234, 404);
		pn2.add(lblImg3);
		
		lblImg4 = new JLabel("");
		lblImg4.setIcon(new ImageIcon(T04_images.class.getResource("/t4_windowBulider/images/5.jpg")));
		lblImg4.setBounds(746, 10, 226, 404);
		pn2.add(lblImg4);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 486, 984, 75);
		frame.getContentPane().add(pn3);
		pn3.setLayout(null);
		
		lblMessage = new JLabel("선택된 카드의 횟수를 보여줍니다");
		lblMessage.setForeground(Color.RED);
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("굴림", Font.BOLD, 20));
		lblMessage.setBounds(0, 0, 984, 75);
		pn3.add(lblMessage);
		
		frame.setVisible(true);
		
		// -----------------------위쪽은 디자인, 아래쪽은 메소드-------------------------------------------
		
		// 1번보기 클릭시 수행
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(true);
				lblImg2.setVisible(false);
				lblImg3.setVisible(false);
				lblImg4.setVisible(false);
				img1Cnt++;
				displayCount();
			}
		});
		// 2번보기 클릭시 수행
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(true);
				lblImg3.setVisible(false);
				lblImg4.setVisible(false);
				img2Cnt++;
				displayCount();
			}
		});
		
		// 3번보기 클릭시 수행
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(false);
				lblImg3.setVisible(true);
				lblImg4.setVisible(false);
				img3Cnt++;
				displayCount();
			}
		});
		
		// 4번보기 클릭시 수행
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(false);
				lblImg3.setVisible(false);
				lblImg4.setVisible(true);
				img4Cnt++;
				displayCount();
			}
		});
		
		// 랜덤보기 클릭시 수행
		btnRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rand = (int)(Math.random()*4) + 1;
				
				if(rand == 1) {
				lblImg1.setVisible(true);
				lblImg2.setVisible(false);
				lblImg3.setVisible(false);
				lblImg4.setVisible(false);
				img1Cnt++;
				}
				else if(rand == 2) {
					lblImg1.setVisible(false);
					lblImg2.setVisible(true);
					lblImg3.setVisible(false);
					lblImg4.setVisible(false);
					img2Cnt++;
					}
				else if(rand == 3) {
					lblImg1.setVisible(false);
					lblImg2.setVisible(false);
					lblImg3.setVisible(true);
					lblImg4.setVisible(false);
					img3Cnt++;
				}
				else if(rand == 4) {
					lblImg1.setVisible(false);
					lblImg2.setVisible(false);
					lblImg3.setVisible(false);
					lblImg4.setVisible(true);
					img4Cnt++;
				}
				displayCount();
			}
		});
		
		// 모두보기 버튼 클릭수 수행
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allDisplay();
				img1Cnt++; img2Cnt++; img3Cnt++; img4Cnt++;
				displayCount();
			}
		});
		
		// 모두닫기 버튼 클릭수 수행
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allClose();
				img1Cnt=0; img2Cnt=0; img3Cnt=0; img4Cnt=0;
				displayCount();
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
	
	// 카운트 수를 레이블에 출력하기
	protected void displayCount() {
		lblMessage.setText("1번 : "+img1Cnt+", 2번: "+img2Cnt+", 3번 :"+img3Cnt+", 4번 :"+img4Cnt+"");
	}


	// 모두 보기 버튼 클릭시 수행
	protected void allDisplay() {
		lblImg1.setVisible(true);
		lblImg2.setVisible(true);
		lblImg3.setVisible(true);
		lblImg4.setVisible(true);
	}
	// 모두 닫기 버튼 클릭시 수행
	protected void allClose() {
		lblImg1.setVisible(true);
		lblImg2.setVisible(true);
		lblImg3.setVisible(true);
		lblImg4.setVisible(true);
	}
	
}
