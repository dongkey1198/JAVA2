package polymorphism;

public class GoldCustomer extends Customer {
	
	double salesRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade ="GOLD";
		bounusRatio = 0.02;
		salesRatio = 0.1;
	}

	@Override
	public int clacPrice(int price) {
		bonusPoint += price * bounusRatio;
		return price - (int)(price * salesRatio);
	}
	
	

}
