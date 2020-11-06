package chapter8_Question1;

import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Year: ");
		int year = InputYMD();
		
		System.out.print("Enter Month: ");
		int month = InputYMD();
		
		System.out.print("Enter Day: ");
		int day = InputYMD();
		
		Date date = new Date(year, month, day);
		
		date.setYear(year);
		date.setMonth(month);
		date.setDay(day);
		
		boolean isValid = date.isValid();
		date.showInfo();
		if(isValid == true) {
			System.out.println("존재가능한 년월일입니다.");
		}
		else {
			System.out.println("존재할수없는 년월일입니다.");
		}
	
	}
	
	public static int InputYMD() {
		Scanner sc = new Scanner(System.in);
		int ymd = sc.nextInt();
		return ymd;
	}
	
}
