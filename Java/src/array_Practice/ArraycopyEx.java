package array_Practice;

import java.util.Arrays;

public class ArraycopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] copyFrom = {'c', 'a', 'n', 'd', 'o'};
		char[] copyTo = new char[5];
		
		System.arraycopy(copyFrom, 0, copyTo, 0, 3);
		System.out.println(new String(copyTo));
		System.out.println(Arrays.toString(copyTo));
		
		for(char c : copyTo) {
			System.out.println(c);
		}
	}

}
