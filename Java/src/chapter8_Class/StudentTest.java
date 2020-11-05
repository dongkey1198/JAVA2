package chapter8_Class;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentID = 123123;
		studentLee.studentName ="이순신";
		studentLee.address = "서울";
		
		Student studentKim = new Student();
		studentKim.studentName ="김동현";
		studentKim.address = "서울";
		studentKim.studentID = 941014;
		
		studentLee.showSudentInfo();
		studentKim.showSudentInfo();
		
	}

}
