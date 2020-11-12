package methodOverriding;

public class VIPCustomer extends Customer {
	

	double salesRatio;
	private int agentID;
	
//	public VIPCustomer() {
//		super(0, null);// 상위클래스의 기본생성자가 호출된다.
//		customerGrade = "VIP";
//		bounusRatio = 0.05;
//		salesRatio = 0.1;
//		System.out.println("VIPCustomer() 생성자 호출");
//	}
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bounusRatio = 0.05;
		salesRatio = 0.1;
		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}

	@Override
	public int clacPrice(int price) {
		
		bonusPoint += price * bounusRatio;
		return price - (int)(price * salesRatio);
		
	}
	
	
	
}
