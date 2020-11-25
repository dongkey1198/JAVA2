package innerClass;

class OutClass{
	
	private int num = 10;
	private static int snum = 20;
	private InnerClass innerClass;
	
	public OutClass() {
		
		innerClass = new InnerClass();
		
	}
	
	class InnerClass{
		int iNum = 100;
		
		void inTest() {
			System.out.println(num); //OuterClass 내에 생성되었기때문에 OuterClass의 private 변수 사용가능
			System.out.println(snum);// static 변수는 클래스 생성과 동시에 생성되기때문에 내부 클래스가 사용가능
		}
	}
	
	public void usingInner() {
		innerClass.inTest();
	}
	
}


public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass outClass = new OutClass(); //내부적으로 InnerClass도 생성된다.
		// innerClass의 인스턴스를 private으로 선언해놓았기 때문에 외부에서 집적적으로 접근한수 없다
		// 따라서 Outter Class 내부에 선언되 innerClass 객체를 이요하여 inTest() 메서드를 호출해야한다.
		outClass.usingInner();
		
		// 아래와 같은 형태로 inner클래스의 인스턴스를 외부에서 생성하는 것도 가능하다
		// 하지만 아래의 방법은 잘사용 하지 않는다.
		// 내부 클래스가 private으로 선언될 경우 이형식은 사용할 수 없다.
		OutClass.InnerClass inner = outClass.new InnerClass(); 
		inner.inTest();
	}	

}
