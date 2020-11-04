package chapter6_While;

public class whileExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;
		int sum = 0;
		
		do{
			sum += num;
			num++;//num은 11까지 올라간당
		}while(num <= 10);
		
		
		System.out.println(sum);
		
		
	}

}
