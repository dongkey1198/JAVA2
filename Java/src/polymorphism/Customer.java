package polymorphism;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bounusRatio;
	
//	public Customer() {
//		customerGrade ="SILVER";
//		bounusRatio = 0.01;
//		System.out.println("Customer() 생성자 호출");
//	}
//	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade ="SILVER";
		bounusRatio = 0.01;
		System.out.println("Customer(int, String) 생성자 호출");
		
	}
	
	public int clacPrice(int price) {
		bonusPoint += price * bounusRatio;
		
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 적립된 보너스 포인트는 " + bonusPoint + "점 입니다."; 
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	

}
