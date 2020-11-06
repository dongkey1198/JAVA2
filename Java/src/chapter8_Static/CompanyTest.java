package chapter8_Static;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company company = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company);
		System.out.println(company2);
		
	}

}
