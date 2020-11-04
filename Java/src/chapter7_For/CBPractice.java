package chapter7_For;

public class CBPractice {
	public static void main(String[] args) {
		
		
		for(int i = 2; i <= 9; i++) {
			if(i%2 != 0) continue;
			for(int j = 1; j <= 9; j++) {
				if(i<j) break;
				System.out.println(i + " X " + j + " = " + (i*j));
			}
			System.out.println();
		}
		
		
	}
}
