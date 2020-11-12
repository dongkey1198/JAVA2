package methodOverriding;

public class OverridingTest {

	public static void main(String[] args) {
		
		Customer Lee = new Customer(10010, "이순신");
		Lee.bonusPoint = 1000;
			
		VIPCustomer Kim = new VIPCustomer(10020, "김유신");
		Kim.bonusPoint = 10000;
		
		int priceLee = Lee.clacPrice(10000);
		int priceKim = Kim.clacPrice(10000);
		
		System.out.println(Lee.showCustomerInfo() + "지불된 금액은 " + priceLee);
		System.out.println(Kim.showCustomerInfo() + "지불된 금액은 " + priceKim);
		
		Customer customerNo = new VIPCustomer(10030, "나몰라");
		customerNo.bonusPoint = 10000;
		System.out.println(customerNo.showCustomerInfo() + "지불금액은 " + customerNo.clacPrice(10000) +"원입니다.");
		

	}

}
