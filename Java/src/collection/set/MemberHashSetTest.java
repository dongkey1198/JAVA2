package collection.set;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemeberHashSet manager = new MemeberHashSet();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark = new Member(300, "Park");
		Member memberPark2 = new Member(300, "Park2");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
		
		manager.showAllMemebers();
		
		manager.removeMember(100);
		manager.showAllMemebers();
	}

}
