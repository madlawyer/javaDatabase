package t2_AWT;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T03_FlowLayout extends Frame implements WindowListener, ActionListener{ //windeowListener, ActionListener 인터페이스해서
	Label lblTitle;																																										//오버라이드 한다음 메소드에 코드 넣어서 사용
	
	public T03_FlowLayout() {
		setLayout(new FlowLayout()); // 위에서 아래로 왼쪽에서 오른쪽으로 가운데 정렬
		setTitle("AWT 프레임(flowlayout)");
		//setSize(300, 250);  // 프레임의 크기(폭, 높이) : 픽셀단위
		setBounds(300, 200, 400, 350); // 좌표와 크기
		
		lblTitle = new Label("레이블 테스트");
		add(lblTitle);
	
		//btnAction.setLabel("Action");
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		Button btn3 = new Button("btn3");
		Button btn4 = new Button("btn4");
		Button btnExit = new Button("Exit");
		
		this.add(btn1);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btnExit);
		
		
		addWindowListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btnExit.addActionListener(this); //액션리스트를 implements 해서 쓴 종료버튼
		
		
		setVisible(true);
		
		
		
		
// -----------------------위쪽은 사용자 인터페이스구현(UI), 아래쪽은 method(동작) 처리 ---------------------		
	}
	
	public static void main(String[] args) {
		new T03_FlowLayout();
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

	@Override
	public void actionPerformed(ActionEvent e) {
		Button btnText = (Button) e.getSource(); // btnText는 버튼을 눌렀을때 실행되는 변수 // (Button) e.getSource() e를 버튼객체로 캐스팅?
		
		if(btnText.getLabel().equals("btn1")) {
			System.out.println("bnt1~~~~~~~~~~~");
			
		}else if(btnText.getLabel().equals("b")) {
			System.out.println("bnt2~~~~~~~~~~~");
		}
		else if(btnText.getLabel().equals("btn3")) {
			lblTitle.setText("btn3호출"); // ?
		}
		else if(btnText.getLabel().equals("btn4")) {
			lblTitle.setText("btn4호출"); // ?
		}
		else if(btnText.getLabel().equals("Exit"))
		System.exit(0);
	}
}
