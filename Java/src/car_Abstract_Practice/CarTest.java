package car_Abstract_Practice;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car avante = new Avante();
		Car sonata = new Sonata();
		Car grandeur = new Grandeur();
		Car genesis = new Genesis();
		
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(avante);
		carList.add(sonata);
		carList.add(grandeur);
		carList.add(genesis);
		
		for(Car car : carList) {
			car.run();
			System.out.println("======================");
		}
	}	

}
