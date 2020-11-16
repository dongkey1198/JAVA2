package array_Practice;

import java.util.Scanner;

public class E0408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String str = sc.nextLine();
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
		
	}

}
