package chapter8_Question2;

public class StarCoffee {
	
	public String name = "Starbucks";
	public int customerCount;
	public int money;
	
	public String sellCoffee(int money) {
		
		this.money += money;// 매출액을 위한 줄
		customerCount++;// 방문한 손님 수
		
		if(money == 4000) {
			return "Americano";
		}
		else {
			return "Latte";
		}
		
	}

}
