package t2_AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T04_BorderLayout extends Frame implements WindowListener, ActionListener {

	public T04_BorderLayout() {
		designView();
	}

	private void designView() {
		setTitle("AWT 프레임(borderlayout)");
		setLayout(new BorderLayout());
		setBounds(300, 200, 400, 350);

		Button btnN = new Button("북쪽");
		Button btnS = new Button("남쪽");
		Button btnW = new Button("서쪽");
		Button btnE = new Button("동쪽");
		Button btnC = new Button("중앙(종료)");

		add(btnN, BorderLayout.NORTH);
		add(btnS, BorderLayout.SOUTH);
		add(btnW, BorderLayout.WEST);
		add(btnE, BorderLayout.EAST);
		add(btnC, BorderLayout.CENTER); // 또는 "Center"

		addWindowListener(this);

		btnC.addActionListener(this); // ✅ 중앙 버튼에 리스너 연결

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button btnText = (Button) e.getSource();
		if (btnText.getLabel().equals("중앙(종료)")) {
			System.exit(0); // ✅ 버튼 클릭 시 종료
		}
	}

	@Override public void windowOpened(WindowEvent e) {}
	@Override public void windowClosing(WindowEvent e) {
		System.exit(0); 
		}
	@Override public void windowClosed(WindowEvent e) {}
	@Override public void windowIconified(WindowEvent e) {}
	@Override public void windowDeiconified(WindowEvent e) {}
	@Override public void windowActivated(WindowEvent e) {}
	@Override public void windowDeactivated(WindowEvent e) {}

	public static void main(String[] args) {
		new T04_BorderLayout();
	}
}