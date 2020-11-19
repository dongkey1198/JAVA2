package Wrapper;

public class WrapperEx1 {

	public static void main(String[] args) {
		
		char ch = 'A';
		int vi = 18;
		Integer i = new Integer(25);
		Double d = new Double(3.14);
		
		System.out.print(Character.getNumericValue(ch));
		System.out.print("\t" + Integer.parseInt("-38") + "\t");// 문자열에서 정수로
		System.out.println(Character.valueOf(ch));
		
		System.out.print("2진수: " + Integer.toBinaryString(vi));
		System.out.print("\t8진수: " + Integer.toOctalString(vi));
		System.out.println("\t16진수: " + Integer.toHexString(vi));
		
		String data = Integer.toString(88);
		System.out.print(i.doubleValue());
		System.out.print("\t" + d.toString() + "\t");
		System.out.println(Character.toLowerCase('D'));
	}

}
