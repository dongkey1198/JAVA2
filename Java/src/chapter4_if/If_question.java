package chapter4_if;

import java.util.Scanner;

public class If_question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적을 입력하세요: ");
		int score = sc.nextInt();
		
		if(score < 60) {
			System.out.println("당신의 점수는 F입니다.");
		}
		else if(score < 70) {
			System.out.println("당신의 점수는 D입니다.");
		}
		else if(score < 80) {
			System.out.println("당신의 점수는 C입니다.");
		}
		else if(score < 90) {
			System.out.println("당신의 점수는 B입니다.");
		}
		else {
			System.out.println("당신의 점수는 A입니다.");
		}
		
	}

}
