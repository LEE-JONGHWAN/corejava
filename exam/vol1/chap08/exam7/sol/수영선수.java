package vol1.chap08.exam7.sol;

import java.time.Duration;
import java.util.logging.Logger;

import com.jbpark.utility.JLogger;

public class 수영선수 extends 운동선수 {
	private String style;
	int seconds = this.getName().hashCode() / 100000;
	public 수영선수(String name, String style) {
		super(name);
		this.style = style;
	}
	@Override
	public String toString() {
		return super.toString() + ", 수영 style=" + style
				+ ", 기록(초): " + seconds;
	}
	
	@Override
	public Duration getRecord() {
		return Duration.ofSeconds(seconds);
	}
	
	public static void main(String[] args) {
		수영선수 박태환 = new 수영선수("박태환", "자유형");
		Logger logger = JLogger.getLogger();
		logger.config(박태환.toString());
	}
}
