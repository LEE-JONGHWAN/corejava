package innerclass;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TalkingClock {
	private int interval;
	private boolean beep;
	
	{
		interval = 1000;
		beep = true;
	}
	

	public int getInterval() {
		return interval;
	}

	public boolean isBeep() {
		return beep;
	}

	public TalkingClock(){
	}



	public static void main(String[] args) {
//		var clock = new start(1000, true);
//		clock.start(1000, true);
		JOptionPane.showMessageDialog(null, "멈출까?");
	}
	
	
	public void start(int interval, boolean beep) {
//		var listener = new ActionListener() {
//		class TimePrinter implements ActionListener() {
//			public void actionPerformed(ActionEvent event) {
//				System.out.println("현재 시각:"
//						+ Instant.ofEpochMilli(event.getWhen()));
//					if(beep) Toolkit.getDefaultToolkit().beep();
//			}
//		}};
		
		var timer = new Timer(interval, e->{
		System.out.println("시각:"
				+ Instant.ofEpochMilli(e.getWhen()));
			if(beep) Toolkit.getDefaultToolkit().beep();
		});
		timer.start();
		}

	
	class TimePrinter implements ActionListener {
		private TalkingClock outer;
		public TimePrinter(TalkingClock clock) {
			outer = clock;
		}
		@Override
		public void actionPerformed(ActionEvent event) {
			System.out.println("At the tone, the time is " 
					+ Instant.ofEpochMilli(event.getWhen()));
			if (outer.isBeep())
				Toolkit.getDefaultToolkit().beep();
		}
	}
}
