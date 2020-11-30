package exception;

import java.io.IOException;

public class ExceptionExample1 {

	public static void main(String[] args) {
		
		byte[] list = {'a','b','c'};
		try {
			System.out.write(list);
		} catch (IOException e) {
			e.printStackTrace();
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
		
	}

}
