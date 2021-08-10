package innerclass;

import java.util.ArrayList;
import java.util.List;

public class Annonym {

	public static void main(String[] args) {
		
		var friends = new ArrayList<String>();
		friends.add("상돈");
		friends.add("기범");
		friends.add("미자");
		invite(friends);
		
		invite(new ArrayList<String>() {
			{ // 익명 부클래스 초기화 블록
				add("일범");
				add("은우");
				add("순형");
			}
		});
		
		class MyFriend<String> extends ArrayList<String> {
		}
		
		friends = new MyFriend<String>();
		friends.add("a");
		friends.add("b");
		friends.add("c");
//		invite(friends);
		var obj = List.of("상규", "태욱");
		invite(obj);

	}

	private static void invite(List<String> arrayList) {
		System.out.println();
	}

}
