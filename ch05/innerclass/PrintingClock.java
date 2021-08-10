package innerclass;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;


public class PrintingClock {
	void createAndRunPClock(ActionListener listener) {
		Timer timer = new Timer(1000, listener);
		timer.start();
	}

	public static void main(String[] args) {
		var printngClock = new PrintingClock();
		var clock = new TalkingClock(1000, false);
		var listener = clock.new TimePrinter();
		
		printngClock.createAndRunPClock(listener);
		JOptionPane.showConfirmDialog(null, "멈출까?");
	}

}
