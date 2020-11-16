package array_Practice;

public class E0410 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] arr = {{"박찬영","진짜병신","멍청이"},
				{"슈퍼","뚱때지"},
				{"케케케케케"}};
		
		for(String[] a:arr) {
			for(String b:a) {
				System.out.print(" " + b);
			}
			System.out.println();
		}
		
	}

}
