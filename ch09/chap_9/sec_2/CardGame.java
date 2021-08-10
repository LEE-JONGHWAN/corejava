package chap_9.sec_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Card {
	String faceImage;
	int iconCount;

	public String getFaceImage() {
		return faceImage;
	}

	public void setFaceImage(String faceImage) {
		this.faceImage = faceImage;
	}

	public int getIconCount() {
		return iconCount;
	}

	public void setIconCount(int iconCount) {
		this.iconCount = iconCount;
	}

	public Card(String faceImage, int iconCount) {
		super();
		this.faceImage = faceImage;
		this.iconCount = iconCount;
	}

	@Override
	public String toString() {
		return "Card [faceImage=" + faceImage + ", iconCount=" + iconCount + "]";
	}
}

public class CardGame {

		public static void main(String[] args) {
			var numbers = new ArrayList<Integer>();
			for (int i = 1; i < 50; i++) {
				numbers.add(i);
			}
			Collections.shuffle(numbers);
			List<Integer> first6 = numbers.subList(0, 6);
			Collections.sort(first6);
			System.out.println(first6);
	}
}


