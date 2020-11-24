package stackandqueue;

import java.util.LinkedList;

public class QueueExample {

	public static void main(String[] args) {
		
		LinkedList<String> queue = new LinkedList<String>();
		
		queue.add("넷");
		queue.add("셋");
		queue.add("둘");
		queue.add("하나");
		
		System.out.println(queue);
		System.out.println(queue.peek());
		
		System.out.println(queue.poll());
		System.out.println(queue);
		
		queue.remove("하나");
		System.out.println(queue);
		
	}

}
