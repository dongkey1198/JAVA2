package inheritenceQuestion;

public class Customer {
	protected static int serialNumber = 10000;
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	Customer(String customerName){
		this.customerName = customerName;
		customerID = serialNumber++;
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	public void showCustomerInfo() {
		System.out.println("회원번호: " + customerID +"||" + customerName + " 님의 등급은 " + customerGrade + "이며,"
				+ "보너스 포인트는" + bonusPoint + "입니다.");
	}
	
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	
	
	
}
