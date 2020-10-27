package chapter6;

public class WhileExample {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;//num은 11까지 올라간당
		}
		System.out.println(sum);
		
	}

}
