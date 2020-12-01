package inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exmaple1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("문자열 입력: ");
		String str = br.readLine();
		System.out.println(str);
		
		int num = Integer.parseInt(br.readLine());
		System.out.println(num);

	}
}
