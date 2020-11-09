package class_study;

public class MyClass {
	
	private static int iv = 0;
	
	void increment() {
		MyClass.iv = 10;
		iv++;
	}
	
	public static String info() {
		return ("iv = " + iv);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(info());
		MyClass a = new MyClass();
		a.increment();
		System.out.println(a);
	}

}
