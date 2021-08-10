package compareTo.study.callback;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TimePrinter  implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("종 울리는 지금, 시각은 " + 
				LocalDateTime.ofInstant(
						Instant.ofEpochMilli(e.getWhen()),
						ZoneId.of("Asia/Seoul")));
		Toolkit.getDefaultToolkit().beep();
		
	}

}
