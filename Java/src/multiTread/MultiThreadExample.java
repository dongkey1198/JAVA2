package multiTread;

class MyThread implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class MultiThreadExample {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new MyThread());
		thread.start();
		System.out.println(thread.getThreadGroup());
		
		ThreadGroup group = new ThreadGroup("MyThread");
		group.setMaxPriority(7);

		Thread thread2 = new Thread(group ,new MyThread());
		thread2.start();
		System.out.println(thread2.getThreadGroup());

	}

}
