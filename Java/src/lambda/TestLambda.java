package lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		
		PrintString lambdaStr = s->System.out.println(s);
		lambdaStr.showString("Java");
		showMyString(lambdaStr);
		
		PrintString test = returnString();
		test.showString("test");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("test2");
	}

	public static PrintString returnString() {
		return s ->System.out.println(s + "!!!");
	}
}
