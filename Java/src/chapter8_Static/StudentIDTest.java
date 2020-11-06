package chapter8_Static;

public class StudentIDTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Lee = new Student("Lee");
		System.out.println(Lee.getSerialNum());
		
		
		Student Kim = new Student("Kim");
		System.out.println(Student.getSerialNum());
		
		System.out.println(Student.getSerialNum());
		System.out.println(Student.getSerialNum());
		
		System.out.println(Lee.getStudentID());
		System.out.println(Kim.getStudentID());
	}

}
