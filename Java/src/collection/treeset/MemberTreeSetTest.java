package collection.treeset;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemeberTreeSet manager = new MemeberTreeSet();
		
		Member memberLee = new Member(300, "Lee");
		Member memberKim = new Member(100, "Kim");
		Member memberPark = new Member(200, "Park");
		
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
	
		
		manager.showAllMemebers();
		
		manager.removeMember(100);
		manager.showAllMemebers();
	}

}
