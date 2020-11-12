package inheritenceQuestion;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer("Lee");
		Customer customerShin = new Customer("Shine");
		Customer customerHong = new GoldCustomer("Hong");
		Customer customerYul = new GoldCustomer("Yul");
		Customer customerKim = new VIPCustomer("Kim", 123123);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
		
		System.out.println("============고객정보 출력============");
		for(Customer customer:customerList) {
			customer.showCustomerInfo();
		}
		
		System.out.println("==========할인율과 보너스 포인트 계산===========");
		int price = 10000;
		for(Customer customer: customerList) {
			System.out.println(customer.getCustomerName()+"님이 " + customer.calPrice(price) +"원 지불하셨습니다.");
			System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트는 " + customer.bonusPoint);
		}
		

	}

}
