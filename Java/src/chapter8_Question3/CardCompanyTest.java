package chapter8_Question3;

public class CardCompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardCompany company = CardCompany.getInstance();
		
		Card myCard = company.createCard();
		Card yourCard = company.createCard();
		
		System.out.println(myCard.getCardNumber());
		System.out.println(yourCard.getCardNumber());
	}

}
