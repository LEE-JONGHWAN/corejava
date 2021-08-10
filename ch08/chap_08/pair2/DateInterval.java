package chap_08.pair2;

import java.time.LocalDate;

import chap_08.pair1.Pair;
import com.jhlee.logger.*;

public class DateInterval extends Pair<LocalDate> {
		@Override
		public void setSecond(LocalDate second) throws Exception {
			if (second.compareTo(getFirst()) >= 0)
				super.setSecond(second);
			else
				throw new Exception("퇴사일-입사일 역전 문제!");
	}
		public static void main(String[] args) {
			DateInterval workPeriod = DateInterval();
			workPeriod.setFirst(LocalDate.of(2020, 3, 2));
			try {
				workPeriod.setSecond(LocalDate.of(2019, 7, 8));
			JLogger.getLogger().info(""
					+ workPeriod.getFirst() + " "
					+ workPeriod.getSecond());
			} catch (Exception e) {
				JLogger.getLogger().warning(e.getMessage());
			}
		}
		
		private static DateInterval DateInterval() {
			return null;
		}
}