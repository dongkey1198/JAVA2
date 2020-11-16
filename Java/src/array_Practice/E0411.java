package array_Practice;

public class E0411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{83, 92, 85},
				{70, 89, 88},
				{95, 98, 94},
				{73, 76, 80}};
		
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
	}

}
