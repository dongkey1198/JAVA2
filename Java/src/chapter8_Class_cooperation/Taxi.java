package chapter8_Class_cooperation;

public class Taxi {
	
	String taxiNumber;
	int money;
	int counter;
	
	public Taxi(String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money += money;
		counter++;
	}
	
	public void showInfo() {
		System.out.println(taxiNumber + "번 택시의 승객은"+ counter + "명 이고, 수입은 " + money + "원 입니다." );
	}
	
}
