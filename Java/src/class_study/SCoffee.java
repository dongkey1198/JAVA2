package class_study;

public class SCoffee {
	
	private int money;
	private static int counter;
	
	public String sellCoffee(int n) {
		
		if(n == 4000) {
			return "Americano";
		}
		else if(n == 4300 ) {
			return "Latte";
		}
		else {
			return "false";
		}
	}
}
