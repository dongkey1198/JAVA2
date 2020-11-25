package innerClass;

class Outter{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		// 메서드 내부에서 inner클래스가 사용되면
		// 메서드안의 지역변수들을 변경 시킬수없다
		// 즉, 메서드안의 모든 지역변수들이 상수가 되는것이다.
		int num = 100;
		
		class MyRunnable implements Runnable{

			@Override
			public void run() {
				
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outter.sNum);
			}
			
		}
		return new MyRunnable();
	}
	
}


public class LocalInnerClassTest {
	
	public static void main(String[] args) {
		
		Outter outter = new Outter();
		Runnable runnable = outter.getRunnable(50);
		runnable.run();

	}

}
