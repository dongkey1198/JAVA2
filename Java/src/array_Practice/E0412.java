package array_Practice;

public class E0412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] scores = {{90,80,70},
				{70,40,50},
				{65,77,82},
				{80,97,100}};
		
			
			
		for(int i = 0; i < scores.length; i++) {
			int total = 0;
			for(int j = 0; j < scores[i].length; j ++) {
				total = scores[i][j];
			}
			double average = total/scores[i].length;
			System.out.println("\ntotal = " + total);
			System.out.println("Average = " + average);
		}
		
		for(int i = 0; i<scores.length; i++) {
			int sum = scores[i][0] +
					scores[i][1] +
					scores[i][2];
			double average = sum/scores[i].length;
			System.out.println("과목"+ (i+1) +": " + sum + "/" + average);
		}
		
	}

}
