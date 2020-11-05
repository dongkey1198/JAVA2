package chapter8_Class;

public class OrderTest {

	public static void main(String[] args) {
		
		
		Order orderKim = new Order();
		
		orderKim.orderID = 20200721001L;
		orderKim.userID = "abc123";
		orderKim.orderDate = "2020년 7월 21일";
		orderKim.userName = "김동현";
		orderKim.productID="PD0345-12";
		orderKim.orderAddress="서울시 영등포구 여의도동 20번지";
		
		orderKim.showOrderInfo();
		
		
	}

}
