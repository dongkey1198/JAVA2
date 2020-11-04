package chapter7_For;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 연산자와 두 수를 변수로 선언한 후 사칙연산이 수행 되는 프로그램을 만들어 보세요
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		double result = 0;
		String op;
		
		System.out.print("첫번째 수를 입력하세요: ");
		num1 = sc.nextInt();
		
		System.out.print("두번째 수를 입력하세요: ");
		num2 = sc.nextInt();
		
		System.out.print("+, - , *, / 중 하나를 입력하세요: ");
		op = sc.next();
		
		if(op.equals("+")) {
			result = num1 + num2;
		}
		else if(op.equals("-")) {
			result = num1 - num2;
		}
		else if(op.equals("*")) {
			result = num1 * num2;
		}
		else if(op.equals("/")) {
			result = (double)num1 / num2;
		}
		else {
			System.out.println("잘못된 보기를 입력하셨습니다!!");
		}
		System.out.println(String.format("%.2f", result));
	}

}
