package Wrapper;

public class E0706 {
	
	public static int getRandomNumber(int n1, int n2) {
		int number = (int) (Math.random()*(n2 - n1 +1) + n1);
		return number;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < 5; i++) {
			System.out.print(getRandomNumber(7, 15)+" ");
		}
	}

}
