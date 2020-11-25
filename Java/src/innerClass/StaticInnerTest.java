package innerClass;

class OutterClass{
	
	private int num = 10;
	private static int snum = 20;
	
	static class InstaticClass{
		// static class의 경우 
		// static variables와 static methods를 선언가능
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(inNum);// instance innerClass의 맴버변수
			System.out.println(sInNum);//instance innerClass의 클래스변수
			System.out.println(snum); //outClass의 맴버 변수
		}
		
		static void sTest() {
			//non-static variable은 클래스 생성전에는 사용할 수 없기때문에
			//static method에서는 사용할 수 없다.
			//System.out.println(inNum);// instance innerClass의 맴버변수
			System.out.println(sInNum);//instance innerClass의 클래스변수
			System.out.println(snum); //outClass의 맴버 변수
		}
	}
	
}


public class StaticInnerTest {

	public static void main(String[] args) {
		
		// 이러한 형태로 객체 생성 가능
		OutterClass.InstaticClass sInClass = new OutterClass.InstaticClass();
		// static innerClass에 non-static method 호출
		sInClass.inTest();
		System.out.println();
		// static innerClass내에 static method 호출
		OutterClass.InstaticClass.sTest();

	}

}
