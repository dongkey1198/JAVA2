package chapter8_Static;

public class Student {
	
	private static int serialNum = 1000;
	
	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}

	private int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소없음";
		serialNum++;
		studentID = serialNum;
	}
	
	public void showSudentInfo() {
		System.out.println("이름: " + studentName);
		System.out.println("아이디: " + studentID);
		System.out.println("주소: " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
}
