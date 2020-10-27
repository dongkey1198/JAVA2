package chapter5_Switch;

import java.util.Scanner;

public class SwitchQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("달을 입력하세요: ");
		
		int month = scanner.nextInt();
		int days = 0;
		
		switch(month) {
			case 1: days = 31;
				break;
			case 2: days = 28;
				break;
			case 3: days = 31;
				break;
			case 4: days = 30;
				break;
			case 5: days = 31;
				break;
			case 6: days = 30;
				break;
			case 7: days = 31;
				break;
			case 8: days = 31;
				break;
			case 9: days = 30;
				break;
			case 10: days = 31;
				break;
			case 11: days = 30;
				break;
			case 12: days = 31;
				break;
			
		}
		
		System.out.println(month + "월은 " + days +"일까지 있습니다.");
		
	}

}
