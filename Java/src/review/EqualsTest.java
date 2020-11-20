package review;

class Student {
	
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentName = studentName;
		this.studentNum = studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student std =(Student)obj;
			
			if(this.studentNum == std.studentNum) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}


}

public class EqualsTest {

	public static void main(String[] args) {
		
		Student Lee = new Student(100, "Lee");
		Student Lee2 = new Student(100,"Lee");
		Student park = new Student(200,"park");
		
		System.out.println(Lee);
		System.out.println(Lee2); 
		System.out.println(Lee.hashCode());
		System.out.println(Lee2.hashCode()); 
		
		
	}

}
