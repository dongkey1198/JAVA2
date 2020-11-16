package array_Practice;

import java.util.Arrays;

public class E0406 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int[] arrCopy = new int[arr.length];
		int[] b = arr.clone();
		System.arraycopy(arr, 0, arrCopy, 0, arr.length);
		
		System.out.println(Arrays.toString(arrCopy));
		System.out.println(Arrays.toString(b));
	}

}
