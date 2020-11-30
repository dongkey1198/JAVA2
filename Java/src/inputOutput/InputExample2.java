package inputOutput;

import java.io.IOException;

public class InputExample2 {

	public static void main(String[] args) {
		System.out.print("문자여러개를 입력하세요: ");
	
		int i;
		try {
			while((i = System.in.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
