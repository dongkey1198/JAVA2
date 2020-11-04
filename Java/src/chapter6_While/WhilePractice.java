package chapter6_While;

import java.util.Scanner;

public class WhilePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num1;
		
		num1 = sc.nextInt();
		
		while(num1 != 0) {
			System.out.print("정수를 입력하세요: ");
			num1 = sc.nextInt();
			sum += num1;
		}
		
		System.out.println(sum);
		
	}

}
