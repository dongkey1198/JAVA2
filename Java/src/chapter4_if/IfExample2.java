package chapter4_if;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요: ");
		int age = scanner.nextInt();
		int charge = 0;
		
		if(age < 8 ) {
			charge = 100;
		}
		else if(age < 14) {
			charge = 1500;
		}
		else if(age < 20) {
			charge = 2000;
		}
		else {
			charge = 3000;
		}
		
		System.out.println("Age : " + age);
		System.out.println("Price : " + charge );
	}

}
