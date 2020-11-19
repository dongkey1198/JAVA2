package Wrapper;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		String s = "I can do it";
		String s2 = "Java";
		
		String s3 = s + s2;
		System.out.println("s + s2 = " + s3);
		
		String str = s.substring(0, 5);
		System.out.println("s.substring(0, 5): " + str);
		System.out.println("JAVA".toLowerCase());
		System.out.println("\n I can do i \n".trim());
		System.out.println("Java".indexOf('J'));
		System.out.println(String.valueOf(3.14));
		System.out.println(Integer.parseInt("88"));
		System.out.println(Double.parseDouble("1.2"));
		String fmt = String.format("%10.2f%5d", 3.14, 8);
		System.out.println("String.format(): " + fmt);
		
		String[] ss = "J a v a".split(" ");
		
		System.out.println(Arrays.toString(ss));
		
		char[] ch = "can".toCharArray();
		for(char e : ch) {
			System.out.println(e);
		}

	}

}
