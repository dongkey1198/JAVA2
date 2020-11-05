package chapter8_Class;

public class AccountTest {

//다음 객체에 대한 설명에 맞는 클래스를 만들고 값을 출력해 보세
// 문제: 나이가 40살, 이름이 James라는 남자가 있습니다.
// 이 남자는 결혼을 했고, 자식이 셋 있습니다.
	
	public static void main(String[] args) {
		Account accountJames = new Account();
		accountJames.age = 40;
		accountJames.name = "James";
		accountJames.isMarried = true;
		accountJames.babyNumbers = 3;
		
		accountJames.showAccountInfo();
		
	}

}
