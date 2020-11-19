package Wrapper;

import java.util.StringTokenizer;

public class E0708 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("010-1234-5678");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken("-"));
		}
		
	}

}
