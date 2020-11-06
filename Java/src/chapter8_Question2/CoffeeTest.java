package chapter8_Question2;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Person james = new Person("James", 10000);
		Person luke = new Person("Luke", 10000);
		
		StarCoffee sCoffee= new StarCoffee();
		BeanCoffee bCoffee = new BeanCoffee();
		
		james.buyScoffee(sCoffee, Menu.STARAMERICANO);
		luke.buyBcoffee(bCoffee, Menu.BEANLATTE);
		
		System.out.println(sCoffee.customerCount);
		
	}

}
