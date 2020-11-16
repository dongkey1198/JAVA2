package array_Practice;

public class RaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{3, 6, 9, 12, 15},
				{4, 8, 16},
				{7, 14}};
		
		System.out.println("< Ragged Array");
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print("array[" + i +"][" + j+"]= "+ a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
