package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		try( AutoClsoeObject obj = new AutoClsoeObject()){
			throw new Exception();
			
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
