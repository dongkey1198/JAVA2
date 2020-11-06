package chapter8_Question2;

public class Person {
	public String pName;
	public int money;
	
	
	public Person(String pName, int money) {
		this.pName = pName;
		this.money = money;
	}
	
	
	public void buyScoffee(StarCoffee starCoffee, int money) {
		String message = starCoffee.sellCoffee(money);
		this.money -= money;// 매출액을 위한 줄
		
		System.out.println(pName+"님이 " +starCoffee.name + "에서 "  + message +" 주문하셨습니다.");
		System.out.println("가격은" + money+ "이고, 남은 금액은 " + this.money);
	}
	
	public void buyBcoffee(BeanCoffee beanCoffee, int money) {
		String message = beanCoffee.sellCoffee(money);
		this.money -= money;		
		System.out.println(pName+"님이 " + message +" 주문하셨습니다.");
		System.out.println("가격은" + money+ "이고, 남은 금액은 " + this.money);
	}
}
