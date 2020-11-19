package Wrapper;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("test");
		sb.append(" to java");
		sb.insert(0, "Vission ");
		System.out.println(sb);
		System.out.println("Substing(): " + sb.substring(0, 5));
		
		String str = sb.substring(3);
		System.out.println(str);
		
		System.out.println("길이: " + sb.length() + ", 용량: " + sb.capacity());
		
		System.out.println("3번째 위치의 문자: " + sb.charAt(2));
		System.out.println("3번째 위치의 문자 unicode: " + sb.codePointAt(2));
		System.out.println("특정 문자열 처음 위치: " +sb.indexOf("t"));
		System.out.println("삭제: " + sb.delete(2, 3 +"sion".length()));
		System.out.println("역순: " + sb.reverse());
	}

}
