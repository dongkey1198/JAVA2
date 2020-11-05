package chapter8_Class;

public class Student {
	
	public int studentID;
	public String studentName;
	public String address;
	
	public Student() {}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소없음";
	}
	
	public void showSudentInfo() {
		System.out.println("이름: " + studentName);
		System.out.println("아이디: " + studentID);
		System.out.println("주소: " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
}
