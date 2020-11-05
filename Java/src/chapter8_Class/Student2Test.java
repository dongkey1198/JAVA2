package chapter8_Class;

public class Student2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student2 studentLee = new Student2(100, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 95);
		
		Student2 studentKim = new Student2(100, "Kim");
		studentKim.setKoreaSubject("국어", 25);
		studentKim.setMathSubject("수학", 45);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}

}
