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
public class T06_AbsoluteLayout extends Frame implements WindowListener, ActionListener{ //windeowListener, ActionListener 인터페이스해서
																																					//오버라이드 한다음 메소드에 코드 넣어서 사용
	public T06_AbsoluteLayout() {
		designView();
	}
	
	private void designView(){
		setTitle("AWT 프레임(AbsoluteLayout)");
		setLayout(null); 
		//setSize(300, 250);  // 프레임의 크기(폭, 높이) : 픽셀단위
		setBounds(300, 200, 400, 350); // 좌표와 크기
		
		int x=100, y=100, w=150, h=30;
		
		Button btn1 = new Button("btn");
		Button btn2 = new Button("btn");
		Button btn3 = new Button("btn");
		Button btn4 = new Button("btn");
		Button btnExit = new Button("Exit");
		
		btn1.setBounds(x,y,w,h);
		btn2.setBounds(x,y+40,w,h);
		btn3.setBounds(x,y+80,w,h);
		btn4.setBounds(x,y+120,w,h);
		btnExit.setBounds(100,260,150,30);
		
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
		//Button btnText = (Button) e.getSource(); // btnText는 버튼을 눌렀을때 실행되는 변수 // (Button) e.getSource() e를 버튼객체로 캐스팅?
		
		System.exit(0); //?
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
		new T06_AbsoluteLayout();
	}
}
