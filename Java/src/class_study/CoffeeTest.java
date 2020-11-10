package class_study;

public class CoffeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person kim = new Person("김동현" , 10000);
		Person park = new Person("박준호", 30000);
		
		SCoffee scoffee = new SCoffee();
		BCoffee bcoffee = new BCoffee();
		
		kim.buySCoffee(scoffee, Menu.STARAMERICANO);
		park.buyBCoffee(bcoffee, Menu.BEANLATTE);
		
	}

}
