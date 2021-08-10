package vol1.chap08.exam7;

import java.time.Duration;

import com.jbpark.utility.JLogger;

//@formatter:off
public class 마라토너 extends 육상선수{
	private short fullRunCount = 0;
	private Duration record;
	public 마라토너(String name, short fullRunCount,
			int seconds) {
		super(name, 42.195, 0);
		this.fullRunCount = fullRunCount;
		this.record = Duration.ofSeconds(seconds);
	}
	public short getFullRunCount() {
		return fullRunCount;
	}
	
	@Override
	public Duration getRecord() {
		return record;
	}
	
	@Override
	public String getRecordString() {
		var recordStr = new StringBuilder();
		recordStr.append(record.toHoursPart());
		recordStr.append(":" + record.toMinutesPart());
		recordStr.append(":" + record.toSecondsPart());	
		return recordStr.toString();
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				", 마라토너[생애완주=" + fullRunCount + "]";
	}
	
	public static void main(String[] args) {
		운동선수 player = new 마라토너("마라토너 아무개", 
				(short) 100, 3600*2+5*60+32);
		JLogger.getLogger().config(player.toString());
	}
}
