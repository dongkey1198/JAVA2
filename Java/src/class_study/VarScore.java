package class_study;

public class VarScore {
	int varReturn(int a) {
		a++;
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		VarScore obj = new VarScore();
		obj.varReturn(a);
		System.out.println(a);
		
		a = obj.varReturn(a);
		System.out.println(a);
	}

}
