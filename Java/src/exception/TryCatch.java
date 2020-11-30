package exception;

public class TryCatch {
	
	public static void main(String[] args) {
		try {
			//예외를 처리하길 원하는 실행코드
		}catch(e1) {
			// e1 예외가 발생할 경우에 실행될 코드
		}catch(e2) {
			// e2 예외가 발생할 경우에 실행될 코드
		}
		finally {
			// 예외 발생 여부와 상관없이 무조건 실행될 코드
		}
	}
}
