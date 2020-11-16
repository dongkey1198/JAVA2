package array_Practice;

import java.util.Arrays;

public class E0409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 5;
		int max = 20;
		int [][] arr = new int[3][4];
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0 ; j <arr[i].length; j++) {
				arr[i][j] = (int) (Math.random()*(max - min) + min);
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}

}
