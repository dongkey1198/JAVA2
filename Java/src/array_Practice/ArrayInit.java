package array_Practice;

import java.util.Arrays;

public class ArrayInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {5,2,8,3,9};
		int sum = 0;
		double average;
		
		for(int e : numbers) {
			sum += e;
		}
		
		average = sum/numbers.length;
		
		System.out.println(Arrays.toString(numbers));
		String grade = String.format("%.2f", average);
		System.out.println(sum + "/" + average);
				
	}

}
