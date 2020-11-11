package chapter9_Array;

public class ArrayQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpahbets = new char[26];
		char c ='A';
		
		for(int i = 0 ; i < alpahbets.length; i ++) {
			alpahbets[i] = c;
			c++;
		}
		for(int j =0; j<alpahbets.length; j++) {
			System.out.println(alpahbets[j]);
		}
	}

}
