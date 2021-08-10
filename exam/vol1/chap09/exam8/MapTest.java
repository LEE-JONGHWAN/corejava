package vol1.chap09.exam8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class MapTest{
	public static void main(String[] args) {
	 Map<String, Integer> carts = new HashMap<>();
	 carts.put("c1234", items);

	 Double cartPrice = calculateCartPrice(items);

	 changeItemCount(carts, "c1234", "복분자주", 2); // 원래 1개였음.
	 System.out.println("가격변화: " + 
	 		(calculateCartPrice(items) - cartPrice));

	 changeItemCount(carts, "c1234", "복분자주", 1);
	 Collections.sort(items); // 항목 수 변화 반영을 위한 정렬
	 Collections.reverse(items); // 정렬된 것을 역순으로 변환
	 items.forEach(System.out::println); 

	}
	

	private static void calculateCartPrice(LinkedList<CartItem> items) {
		double totalPrice = 0.0;
		Iterator<CartItem>cItems = items.iterator();
		while(cItems.hasNext()) {
			CartItem item = cItems.next();
			totalPrice = 
				totalPrice + item.getItemPrice;
		}
		
	}		
//		return items.stream().map(CartItem::getItemPrice)
//				.reduce(0.0, Double::sum);

	
	private static void changeItemCount(
			Map<String, Integer> carts, 
			String cartId, String itemName,
			int count) {
		for(CartItem item : carts.get(cartId)) {
			if(item.getName().equals(itemName)) {
				item.setCount(count);
				return;
			}
		}
		
	}

	
}
