package object;

class Student{
	int studentNum;
	String studentName;
	
	public Student(int studentnum, String studentName) {
		this.studentName = studentName;
		this.studentNum = studentnum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if((this.studentNum == std.studentNum)) {
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

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	
	
}

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student Lee = new Student(100, "이순신");
		Student Lee2 = Lee;
		
		Student Shin = new Student(100, "이순신");
		
		System.out.println(Lee == Shin);
		System.out.println(Lee == Lee2);
		System.out.println(Lee.equals(Lee2));
		System.out.println(Lee.equals(Shin));
		
		System.out.println(Lee);
		System.out.println(Lee2);
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
//		System.out.println(i1.equals(obj));
		
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		
		
		
	}

}
