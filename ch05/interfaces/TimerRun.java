package interfaces;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerRun {

	public static void countDown(int start, int delay) {
		ActionListener listener = evt -> {
//			start--;
			System.out.println(start);
		};
		new Timer(delay, listener).restart();
	}


	
	public static void repeatMessage(String text, int delay) {
		ActionListener listener = e -> {
			System.out.println(text);
			java.awt.Toolkit.getDefaultToolkit().beep();
		};
		new Timer(delay, listener).start();
		System.out.println("메소드 종료");
	}

	public static void main(String[] args) {
		repeatMessage("안녕", 1000);
		JOptionPane.showMessageDialog(null, "Stop?");
		System.exit(0);
		{
			int i = 0;
			{
				int j = 1;
				float o = 3f;
			}
		}
	}
}

