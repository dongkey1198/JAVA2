package Inheritence;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer Lee = new Customer(10010, "이순신");
	//	Lee.setCustomerID(10010);
	//	Lee.setCustomerName("이순시");
		Lee.bonusPoint = 1000;
		System.out.println(Lee.showCustomerInfo());
		
		//VIPCustomer Kim = new VIPCustomer(10020, "김유신");
		Customer Kim = new VIPCustomer(10020, "김유신");
//		Kim.setCustomerName("김유신");
//		Kim.setCustomerID(10020);
		Kim.bonusPoint = 10000;
		System.out.println(Kim.showCustomerInfo());
		
	
	}

}
