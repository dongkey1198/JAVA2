package chapter8_Class;


//This chapter is studying about the reference between classes

public class Student2 {
	int studentID;
	String studentName;
	
	Subject korea;
	Subject math;
	
	public Student2(int id, String name) {
		studentID = id;
		studentName = name;
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName+"학생의 총점은 " + total +"점 입니다.");
	}
	
}
