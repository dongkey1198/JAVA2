package class_study;

public class CardCompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardCompany company = CardCompany.getInstance();
		Card card1 = company.createCard();
		Card card2 = company.createCard();
		Card card3 = company.createCard();
		Card card4 = company.createCard();
		Card card5 = company.createCard();
		Card card6 = company.createCard();
		
		System.out.println(card1.getCardNumber());
		System.out.println(card2.getCardNumber());
		System.out.println(card3.getCardNumber());
		System.out.println(card4.getCardNumber());
		System.out.println(card5.getCardNumber());
		System.out.println(card6.getCardNumber());
		}

}
