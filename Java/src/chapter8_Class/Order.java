package chapter8_Class;

public class Order {
	
	public long orderID;
	public String userID;
	public String orderDate;
	public String userName;
	public String productID;
	public String orderAddress;
	
	public void showOrderInfo(){
		System.out.println("주문번호: " + orderID);
		System.out.println("주문자 아이디: " + userID);
		System.out.println("주문 날짜: " + orderDate);
		System.out.println("주문자 이름: " + userName);
		System.out.println("주문 상품 번호: " + productID);
		System.out.println("배송 주소: " + orderAddress);
	}
	
}
