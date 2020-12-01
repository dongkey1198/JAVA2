package thread;

class ThreadWithClass extends Thread{
	public void run() {
		for(int i = 0; i< 5; i++) {
			
			// 현재 실행 중인 스레드의 이름을 반환
			System.out.println(getName());
			
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}


class ThreadWithRunnable implements Runnable{

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

public class Example1 {

	public static void main(String[] args) {
		
		ThreadWithClass thread1 = new ThreadWithClass();
		Thread thread2 = new Thread( new ThreadWithRunnable());
		
		thread1.start();
		thread2.start();

	}

}
