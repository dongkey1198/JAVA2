package class_study;

public class CardCompany {
	
	private static CardCompany instance = new CardCompany();
	
	private CardCompany() {} // 기본생선자를 private으로 생성 인스턴스를 무작위로 생성할수없게
	
	public static CardCompany getInstance() {
		return instance; // 유일한 인스턴스로 사용할 객체를 리턴한다.	
	}
	
	public Card createCard() {
		Card card = new Card();
		return card;
	}
}
