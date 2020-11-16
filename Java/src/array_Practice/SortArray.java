package array_Practice;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 8, 3, 5, 9, 4, 1, 7, 2};
		int[] revAr = new int[ar.length];
		
		Arrays.sort(ar);// 올림차순으로 정렬
		System.out.println(Arrays.toString(ar));
		
		System.out.print("역순으로 출력: ");
		for(int i = ar.length - 1; i >= 0;i--) {
			System.out.print(" " + ar[i]);
		}
		
		System.out.print("\n올림차순 출력: ");
		for(int i = 0 ; i< ar.length; i++) {
			System.out.print(" " + ar[i]);
		}
		
		String[] name = {"Java", "C", "Oracle", "Eclipse"};
		Arrays.sort(name, Collections.reverseOrder());
		System.out.println("\nname 정렬: " + Arrays.toString(name));
	}
	
}
