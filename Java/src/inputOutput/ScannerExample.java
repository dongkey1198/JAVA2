package inputOutput;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String str = scanner.nextLine();
		System.out.println(str);
		
		System.out.print("정수 입력: ");
		int num = scanner.nextInt();
		System.out.println(num);
		
		System.out.print("소수 입력: ");
		double num2 = scanner.nextDouble();
		System.out.println(num2);
		
	}

}
