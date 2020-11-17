package collection.treeset;

import java.util.TreeSet;
import java.util.Iterator;

public class MemeberTreeSet {
	
	private TreeSet<Member> treeSet;
	
	public MemeberTreeSet() {
		treeSet = new TreeSet<Member>(new Member());
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Member> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "번호가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMemebers() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
