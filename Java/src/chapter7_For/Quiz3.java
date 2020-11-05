package chapter7_For;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 1; j < num-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k<i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int a = num; a > 0; a--) {
			for(int b = num-a ; b > 0 ; b--) {
				System.out.print(" ");
			}
			for(int c = a*2-1; c>0; c--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
