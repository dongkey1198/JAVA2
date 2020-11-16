package array_Practice;

import java.util.Arrays;

public class ArrayTwoEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ar = {{10,20,30,40}, {15,24,35,45}, {50,60,70,80}};
		
		System.out.println("요소: " + Arrays.deepToString(ar));
		
		for(int i = 0; i < ar.length; i ++) {
			for(int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int[] a : ar) {
			for(int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		
	}

}
