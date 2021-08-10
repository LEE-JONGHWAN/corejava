package vol1.chap08.exam7;

import java.time.Duration;

import com.jbpark.utility.JLogger;

public class 운동선수 {
	private String name;

	public 운동선수(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "선수명=" + name;
	}

	public Duration getRecord() {
		return null;
	}

	public static void main(String[] args) {
		운동선수 player = new 운동선수("아무선수");
		JLogger.getLogger().config(player.toString());
	}
}
