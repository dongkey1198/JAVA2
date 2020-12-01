package thread;

class ThreadWithRunnable2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			//현재 실행 중인 스레드의 이름을 반환
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

public class Example2 {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread( new ThreadWithRunnable2());
		Thread thread2 = new Thread( new ThreadWithRunnable2());
		
		thread2.setPriority(10);
		
		thread1.start();//thread 0
		thread2.start();//thread 1
		
		System.out.println(thread1.getPriority());
		System.out.println(thread2.getPriority());
	}

}
