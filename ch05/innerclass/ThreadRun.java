package innerclass;

import javax.swing.JOptionPane;

public class ThreadRun {
	public static void main(String[] args) {
	var action = new Runnable() {
		@Override
		public void run() {
			while (true)
				try {
					Thread.sleep(1000);
					System.out.println(" 안녕하시오?");
				} catch (InterruptedException e) {
					e.printStackTrace();
					break;
				}
		}
	};
	var thd = new Thread(action);
	thd.start();
	JOptionPane.showConfirmDialog(null, "멈춰주시오?");
	thd.interrupt();
	}
}
