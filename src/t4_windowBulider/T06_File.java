package t4_windowBulider;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

public class T06_File {

	private JFrame frame;

	
	public static void main(String[] args) {
		new T06_File();
					
			
	}

	
	public T06_File() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("파일 연습");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnImage = new JButton("이미지 선택");
		btnImage.setFont(new Font("굴림", Font.BOLD, 19));
		btnImage.setBounds(0, 20, 213, 36);
		frame.getContentPane().add(btnImage);
		
		JLabel lblImage = new JLabel("");
		lblImage.setFont(new Font("굴림", Font.BOLD, 17));
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setBounds(0, 83, 784, 308);
		frame.getContentPane().add(lblImage);
		
		JTextArea taMessage = new JTextArea();
		taMessage.setFont(new Font("Monospaced", Font.BOLD, 18));
		taMessage.setBounds(10, 455, 762, 96);
		frame.getContentPane().add(taMessage);
		
		frame.setVisible(true);	
		
	//-------------------------------------위쪽은 디자인, 아래쪽은 메소드-----------------------------------------	
		
		// 이미지 선택버튼을 클릭하면 수행(lblImage상자에 그림파일을 출력시켜준다.)
			btnImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				
				FileNameExtensionFilter fileter = new FileNameExtensionFilter("JpG & GIF & PNG Images","jpg","gif","png");
				chooser.setFileFilter(fileter);
				
				int res = chooser.showOpenDialog(null);
				
				if(res != chooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(frame, "파일을 선택해 주세요","경고",JOptionPane.WARNING_MESSAGE);
				}
				else {
					String filePath = chooser.getSelectedFile().getPath();
					String fileName = chooser.getSelectedFile().getName();
					
					lblImage.setIcon(new ImageIcon(filePath));
					
					String fileInfo = "경로명과 파일명 : " + filePath + " \n파일명 : " + fileName;
					taMessage.setText(fileInfo);
				}
			}
		});
	}
}
