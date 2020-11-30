package inputOutput;

import java.io.IOException;

public class InputExample1 {

	public static void main(String[] args) {
		
		System.out.print("알파벳 하나를 입력하세요: ");
		int i;
		try {
			i = System.in.read();
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
