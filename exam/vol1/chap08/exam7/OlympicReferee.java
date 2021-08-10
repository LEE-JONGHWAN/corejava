package vol1.chap08.exam7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import com.jbpark.utility.JLogger;

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
	private static Logger logger = JLogger.getLogger();
	
	public static void main(String[] args) {
		// 모든 종목 메달 수상자 목록 구성
		var allGameMedalists = 
				new ArrayList<Medalist<? super 운동선수>>();
		
		// 두 종목 메달 수상자 정보 확보
		Medalist<? super 운동선수> oneGameMedalists // 하한 만능패
				= findMedalist(getMarathonRecords());
		logger.config(oneGameMedalists.toString());
		allGameMedalists.add(oneGameMedalists);
		
		oneGameMedalists = findMedalist(get200Records());
//		마라토너 mara = two00Medalists.getGoldMedal(); // 오류
//		육상선수 fter = two00Medalists.getGoldMedal(); // 오류
		logger.config(oneGameMedalists.toString());
		allGameMedalists.add(oneGameMedalists);

		// 전 종목 금메달 수상자 목록 확보
		ArrayList<? extends 운동선수> allGoldMedalists = 
												// 상한 만능패
				findGoldMedalists(allGameMedalists);
		운동선수 선수 = allGoldMedalists.get(0);	// 읽기
//		allGoldMedalists.set(0, new 육상선수(null, 0, 0)); // 컴파일 오류
		// 전 종목 금메달 수상자 목록 출력
		for (운동선수 winner : allGoldMedalists) { // 읽기
			logger.config("금메달 수상자\n\t" + winner.toString());
		}
	}
	
	/**
	 * 기록 증가순으로 달리기 선수 메달 수여자를 찾는다.
	 * @param runners 달리기 선수 정보(경기 기록 포함)배열
	 * @return 메달 수상자 (3명) 정보
	 */
	/*
	 *  여기 findMedalist 메소드를 정의하라.
	 */
	
	/**
	 * 전 종목 메달 수상자 목록에서 금메달 수상자 목록을 찾아낸다.
	 * @param allGameMedalists 전 종목 메달 수상자 목록
	 * @return 금메달 수상자 목록
	 */
	/*
	 *  여기 findGoldMedalists 메소드를 정의하라.
	 */	
	
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
	private static 육상선수[] getMarathonRecords() {
		var runners = new 마라토너[4];
		
		runners[0] = new 마라토너("손기정", (short) 100, 3600*2+5*60+31);
		runners[1] = new 마라토너("강기정", (short) 80, 3600*2+6*60+38);
		runners[2] = new 마라토너("한기정", (short) 58, 3600*2+4*60+32);
		runners[3] = new 마라토너("남기정", (short) 67, 3600*2+3*60+30);
		return runners;
	}	
}
