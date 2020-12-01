package thread;

class MyThread extends Thread{
	public void run() {
		for(int i = 0; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i +"\t");
		}
		try {
			sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Example3 {
	
	public static void main(String[] args) {
		
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		
		th1.start();
		th2.start();
	}

}
