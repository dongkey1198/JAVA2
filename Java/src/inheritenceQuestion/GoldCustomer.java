package inheritenceQuestion;

public class GoldCustomer extends Customer {
	
	double salesRatio;
	
	GoldCustomer(String customerName) {
		super(customerName);
		customerGrade ="GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}

	@Override
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price = price -(int)(price*salesRatio);
	}
	
	

	
	
	
	
}
