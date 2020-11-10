package class_study;

public class Person {
	private String name;
	private int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public void buySCoffee(SCoffee scoffee, int money) {
		String message = scoffee.sellCoffee(money);
		this.money -= money;
		System.out.println(name + "님은 " +"Sturbuck에서 " +  message + "를 주문하셨습니다."  );
		System.out.println("현재 " + name + "님의  남은 금액은 " + this.money + "원 입니다." );
	
	}
	public void buyBCoffee(BCoffee bcoffee, int money) {
		String message = bcoffee.sellCoffee(money);
		this.money -= money;
		System.out.println(name + "님은 " +"Coffee Bean에서 " +  message + "를 주문하셨습니다."  );
		System.out.println("현재 " + name + "님의  남은 금액은 " + this.money + "원 입니다." );
	
	}
}
