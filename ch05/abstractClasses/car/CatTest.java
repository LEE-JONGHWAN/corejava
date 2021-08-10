package abstractClasses.car;

import java.util.ArrayList;

public class CatTest {

	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		
		carList.add(new Sonata());
//		carList.add(new Granduer());
//		carList.add(new Avante());
//		carList.add(new Genesis());
		
		for(Car car : carList) {
			car.run();
		}

	}

}
