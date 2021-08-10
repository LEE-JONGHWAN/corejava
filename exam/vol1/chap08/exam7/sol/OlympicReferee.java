package vol1.chap08.exam7.sol;

import java.util.Arrays;
import java.util.logging.Logger;

import com.jbpark.utility.JLogger;



class GoldTreat<T> {
	private T gold수상자;

	public void setGold수상자(T gold수상자) {
		this.gold수상자 = gold수상자;
	}
	
	@Override
	public String toString() {
		return "금메달.수상자\n\t" + gold수상자.toString();
	}
}

/**
 * 이 프로그램은 만능패(wildcard: '?') 형인자의 상한, 하한 특성
 * 별 기능을 시험적으로 보여 준다. 
 * 		상한(extends)은 자료 '읽기' 가능이며,
 * 		하한(super)은 자료 '쓰기'를 할 수 있다.  
 * @author Jongbum Park
 *
 */
public class OlympicReferee {
	//@formatter:off
	private static Logger logger = JLogger.getLogger(true);
	
	public static void main(String[] args) {
		// 각 종목 메달 수상자 정보 확보
		// "? extends" 빼면 (1)
		Medalist<? extends 운동선수> aGameMedalists;

		GoldTreat<Object> goldTreatObj = new GoldTreat<>();
		
		// 아래에서 "? super"를 빼면 (2)
		// super 를 extends 로 바꾸면 (3)
		// '운동선수'를 '육상선수'로 하면 (4)
		GoldTreat<? super 운동선수> goldTreat = new GoldTreat<>();
		
		goldTreat = goldTreatObj;
		
		aGameMedalists = find마라톤Medalist(get마라톤Records());
			// setGold수상자(<? super 운동선수> arg) // arg = 운동선수;
		goldTreat.setGold수상자((육상선수)aGameMedalists.getGoldMedal());
		logger.config(goldTreat.toString());
		
		aGameMedalists = find200Medalist(get200Records());
		// setGold수상자(<? super 운동선수> arg) // arg = 육상선수;
		goldTreat.setGold수상자((육상선수)aGameMedalists.getGoldMedal());
		logger.config(goldTreat.toString());
		
		aGameMedalists = findSwimMedalist(getSwimRecords());
		// setGold수상자(<? super 운동선수> arg) // arg = 수영선수;
		goldTreat.setGold수상자((수영선수)aGameMedalists.getGoldMedal());
		logger.config(goldTreat.toString());		
	}

	/**
	 * 기록 증가순으로 달리기 선수 메달 수여자를 찾는다.
	 * @param runners 달리기 선수 정보(경기 기록 포함)배열
	 * @return 메달 수상자 (3명) 정보
	 */
	private static Medalist<육상선수> find200Medalist(
			육상선수[] runners) {
		var medalist = new Medalist<육상선수>();
		
		Arrays.sort(runners, (r1, r2)->
			r1.getRecord().compareTo(r2.getRecord()));
		medalist.setGoldMedal(runners[0]); // 쓰기 가능
		medalist.setSilverMedal(runners[1]); // 육상선수 혹은
		medalist.setBronzeMedal(runners[2]); // 마라토너
		logger.config(medalist.toString());	
		return medalist;
	}
	private static Medalist<수영선수> findSwimMedalist(
			수영선수[] runners) {
		var medalist = new Medalist<수영선수>();
		
		Arrays.sort(runners, (r1, r2)->
		r1.getRecord().compareTo(r2.getRecord()));
		medalist.setGoldMedal(runners[0]); // 쓰기 가능
		medalist.setSilverMedal(runners[1]); // 육상선수 혹은
		medalist.setBronzeMedal(runners[2]); // 마라토너
		logger.config(medalist.toString());	
		return medalist;
	}
	
	private static Medalist<마라토너> find마라톤Medalist(
			마라토너[] runners) {
		var medalist = new Medalist<마라토너>();
		
		Arrays.sort(runners, (r1, r2)->
			r1.getRecord().compareTo(r2.getRecord()));
		medalist.setGoldMedal(runners[0]); // 쓰기 가능
		medalist.setSilverMedal(runners[1]); // 육상선수 혹은
		medalist.setBronzeMedal(runners[2]); // 마라토너
		logger.config(medalist.toString());		
		return medalist;
	}
	
	/**
	 * 달리기 선수 이름, 주종목 거리(미터), 최근 기록 정보 배열을 구성한다.
	 * @return 달리기 선수 정보 배열
	 */
	private static 육상선수[] get200Records() {
		var runners = new 육상선수[4];
		
		runners[0] = new 육상선수("김재근", 200, 20234L);
		runners[1] = new 육상선수("이재근", 200, 20134L);
		runners[2] = new 육상선수("최재근", 200, 20264L);
		runners[3] = new 육상선수("민재근", 200, 20244L);
		return runners;
	}
	
	/**
	 * 마라토너 이름, 완주회수, 최근기록 정보 배열을 구성한다.
	 * @return 마라톤너 정보 배열
	 */
	private static 마라토너[] get마라톤Records() {
		var runners = new 마라토너[4];
		
		runners[0] = new 마라토너("손기정", (short) 100, 3600*2+5*60+31);
		runners[1] = new 마라토너("강기정", (short) 80, 3600*2+6*60+38);
		runners[2] = new 마라토너("한기정", (short) 58, 3600*2+4*60+32);
		runners[3] = new 마라토너("남기정", (short) 67, 3600*2+3*60+30);
		return runners;
	}	
	
	private static 수영선수[] getSwimRecords() {
		수영선수[] 한국수영선수 = new 수영선수[4];
		
		한국수영선수[0]  = new 수영선수("박태환", "배영");
		한국수영선수[1]  = new 수영선수("최태환", "평영");
		한국수영선수[2]  = new 수영선수("김태환", "자유형");
		한국수영선수[3]  = new 수영선수("정태환", "접영");

		return 한국수영선수;
	}	
}
