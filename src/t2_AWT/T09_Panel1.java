package t2_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T09_Panel1 extends Frame implements WindowListener, ActionListener{ //windeowListener, ActionListener(버튼 때문에) 인터페이스해서
																																					//오버라이드 한다음 메소드에 코드 넣어서 사용
	public T09_Panel1() {
		designView();
	}
	
	private void designView(){
		setTitle("AWT 프레임(GridLayout)");
		setLayout(new GridLayout(3,1)); 
		setBounds(300, 200, 400, 350); // 좌표와 크기
		
		Panel pn1 = new Panel();
		Panel pn2 = new Panel();
		Panel pn3 = new Panel();
		
		Label lbl1 = new Label();
		Label lbl2 = new Label();
		Label lbl3 = new Label("세번째 패널입니다.");
		
		lbl1.setText("첫번째 패널입니다.");
		lbl2.setText("두번째 패널입니다.");
		
		pn1.add(lbl1);
		pn2.add(lbl2);
		pn3.add(lbl3);
		
		add(pn1);
		add(pn2);
		add(pn3);
		
		addWindowListener(this);

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
		new T09_Panel1();
	}
}
