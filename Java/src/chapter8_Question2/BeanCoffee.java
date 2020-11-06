package chapter8_Question2;

public class BeanCoffee {
	public String name = "Coffee Bean";
	public int customerCount;
	public int money;
	
	public String sellCoffee(int money) {
		
		this.money += money;
		customerCount++;
		
		if(money == 4100) {
			return "Americano";
		}
		else {
			return "Latte";
		}
	}
}
