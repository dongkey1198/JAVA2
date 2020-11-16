package array_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScan {

	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		int sum = 0;
		double average;
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("정수입력"+ (i+1) +": ");
			numbers[i] = sc.nextInt();
		}
		
		for(int e : numbers) {
			sum += e;
		}
		
		average = sum / numbers.length;
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(sum);
		System.out.println(average);

	}

}
