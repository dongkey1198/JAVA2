package array_Practice;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7, 3, 5, 2, 9};
		int[] b = a.clone();
		
		for(int i = 0; i < a.length; i++) {
			System.out.print("b[" + i +"] = " + b[i] + " ");
		}
		
		System.out.print("\narraycopy() 메소드를 사용한 배열 복사:");
		int[] c = new int[a.length];
		System.arraycopy(a, 0, c, 0, a.length);
		for(int i = 0; i < c.length; i++) {
			System.out.print(" " + c[i]);
		}
		
		System.out.print("\narraycopy() 메소드를 사용한 특정부분 복사:");
		System.arraycopy(a, 0, c, 3, 2);
		for(int e: c) {
			System.out.print(" " + e);
		}
		
		System.out.print("\n반복문을 이용한 배열 복사: ");
		int[] d = new int[a.length];
		for(int i = 0; i<a.length; i++) {
			d[i] = a[i];
			System.out.print(" " + d[i]);
		}
		
		System.out.print("\ncopyOf()을 이용한 배열복사: ");
		int[] g = new int[a.length];
		g = Arrays.copyOf(a, a.length);
		for(int e: g) {
			System.out.print(" " + e);
		}
		
		
	}

}
