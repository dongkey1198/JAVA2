package array_Practice;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {5,8,7,6,9};
		
		for(int i = 0; i<a.length; i++) {
			System.out.print("a[" + i +"] = " + a[i] + ", " );
		}
		System.out.println();
		
		for(int e : a) {
			System.out.print(e +", ");
		}
	}

}
