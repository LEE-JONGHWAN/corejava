package vol1.chap08.exam7.sol;

import java.time.Duration;

import com.jbpark.utility.JLogger;

public class 육상선수 extends 운동선수 {
	private double distance;
	private Duration record;

	public 육상선수(String name, double distance, 
			long millis) {
		super(name);
		this.distance = distance;
		this.record = Duration.ofMillis(millis);
	}

	
	public Duration getRecord() {
		return record;
	}

	public void setRecord(Duration record) {
		this.record = record;
	}

	public double getDistance() {
		return distance;
	}
	
	public String getRecordString() {
		int sec = record.toSecondsPart();
		int mil = record.toMillisPart();
		String record = String.format("%2d.%2d", sec, mil); 
		return record  + "초";
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 주종목=" 
				+ distance + "m" + ", 기록=" + getRecordString();
	}
	
	public static void main(String[] args) {
		운동선수 player = new 육상선수("육상아무개", 200, 20234L);
		JLogger.getLogger().config(player.toString());
	}
}
