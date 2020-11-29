package exception;

public class IDFormatTest {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {
		
		if(userID == null) {
			throw new IDFormatException("아이디는 null 일수 없습니다.");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20 이하로 쓰세요");
		}
		this.userID = userID;
	}

	public static void main(String[] args) {
		
		IDFormatTest idTest = new IDFormatTest();
		
		String MyId = null;
		try {
			idTest.setUserID(MyId);
		} catch (IDFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		MyId ="123456";
		try {
			idTest.setUserID(MyId);
		} catch (IDFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}

}
