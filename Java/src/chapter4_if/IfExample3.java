package chapter4_if;

public class IfExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		int max;
		
		max = (a>b)? a:b;
		System.out.println(max);
		
		if(a>b) {
			System.out.println(a);
		}
		else{
			System.out.println(b);
		}
	}

}
