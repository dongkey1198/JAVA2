package class_study;

public class BCoffee {
	
	private int money;
	private static int counter;
	
	public String sellCoffee(int n) {
		
		if(n == 4100) {
			return "Americano";
		}
		else if(n == 4500 ) {
			return "Latte";
		}
		else {
			return "false";
		}
	}

}
