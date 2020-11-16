package array_Practice;

public class E0414 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{0}, {1, 2}, {3,4,5},{6,7,8,9}};
		
		for(int[] a : arr) {
			for(int b : a) {
				System.out.print(" " + b );
			}
			System.out.println( );
		}
	}

}
