package innerClass;

class Outter2{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		// 메서드 내부에서 inner클래스가 사용되면
		// 메서드안의 지역변수들을 변경 시킬수없다
		// 즉, 메서드안의 모든 지역변수들이 상수가 되는것이다.
		int num = 100;
		
		return new Runnable(){

			@Override
			public void run() {
				
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outter.sNum);
			}
			
		};
	}
	
	Runnable runner =  new Runnable() {
		
		@Override
		public void run() {
			System.out.println("test");
		}
	};
	
}


public class AnonymousInnerClassTest2 {
	
	public static void main(String[] args) {
		
		Outter2 outter = new Outter2();
		outter.runner.run();
	
		Runnable runnable = outter.getRunnable(50);
		runnable.run();

	}

}
