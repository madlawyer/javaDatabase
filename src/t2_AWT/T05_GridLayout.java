package t2_AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T05_GridLayout extends Frame implements WindowListener, ActionListener{ //windeowListener, ActionListener 인터페이스해서
																																					//오버라이드 한다음 메소드에 코드 넣어서 사용
	public T05_GridLayout() {
		designView();
	}
	
	private void designView(){
		setTitle("AWT 프레임(GridLayout)");
		setLayout(new GridLayout(2,3)); 
		//setSize(300, 250);  // 프레임의 크기(폭, 높이) : 픽셀단위
		setBounds(300, 200, 400, 350); // 좌표와 크기
		
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		Button btn3 = new Button("btn3");
		Button btn4 = new Button("btn4");
		Button btnExit = new Button("Exit");
		
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btnExit);
		
		
		addWindowListener(this);
		btnExit.addActionListener(null);
		
		setVisible(true);
		
		
		
		
// -----------------------위쪽은 사용자 인터페이스구현(UI), 아래쪽은 method(동작) 처리 ---------------------		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Button btnText = (Button) e.getSource(); // btnText는 버튼을 눌렀을때 실행되는 변수 // (Button) e.getSource() e를 버튼객체로 캐스팅?
		if (btnText.getLabel().equals("Exit")) {
			System.exit(0); // ✅ 버튼 클릭 시 종료
		}
	}
	
	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	public static void main(String[] args) {
		new T05_GridLayout();
	}
}
