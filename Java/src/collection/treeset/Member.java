package collection.treeset;

import java.util.Comparator;

public class Member implements Comparator<Member>{
	
	private int memberId;
	private String memberName;
	
	public Member() {}
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName+"회원님의 아이디는 " + memberId + "입니다.";
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return(this.memberId == member.memberId);
		}
		return false;
	}
//	@Override
//	public int compareTo(Member member) {
//		
////		return (this.memberId - member.memberId); // 양수로 반환하면 오름차순
////		return (this.memberId - member.memberId)*(-1); //음수로 반환하면 내림차순
//		return this.memberName.compareTo(member.getMemberName()); //이름 오름차순
//		
//	}
	@Override
	public int compare(Member member1, Member member2) {
		// TODO Auto-generated method stub
		return (member1.memberId - member2.memberId);
	}
	
	
	
}
