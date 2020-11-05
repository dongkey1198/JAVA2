package chapter7_For;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 9; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int k = 0; k < 9; k++) {
			for(int l = 9; l > k; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int a = 0; a<num; a++) {
			for(int b = 1; b < num - a; b++) {
				System.out.print(" ");
			}
			for(int c = 0; c < a + 1; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int q = 0 ; q<num; q++) {
			for(int e = 1; e <= q; e++) {
				System.out.print(" ");
			}
			for(int w = 0; w < num - q; w++) {
				System.out.print("*");
			}
		
			System.out.println();
		}
	}

}
