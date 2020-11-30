package exception;

public class ThrowableExample {

	public static void main(String[] args) {
		
		try {
			System.out.println(5/0);
		}catch(ArithmeticException e) {
			System.out.println("현재 발생한 예외 정보: " + e.getMessage());	
		}

	}

}
