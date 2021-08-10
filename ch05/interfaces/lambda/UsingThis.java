package interfaces.lambda;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class UsingThis {
		String identity = "시험용 클래스";
		@Override
		public String toString() {
			return "Application [identity=" + identity + "]";
		}
		public void init() {
			ActionListener listener = event -> {
				System.out.println(this.toString());
			};
			new Timer(1000, listener).start();
		}
		public static void main(String[] args) {
			UsingThis appl  = new UsingThis();
			appl.init();
			JOptionPane.showMessageDialog(null, "Stop?");
			System.exit(0);
		}
	}
