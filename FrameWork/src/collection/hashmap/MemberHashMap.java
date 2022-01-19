package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {
	private HashMap<Integer,Member> hashmap;
	public MemberHashMap() {
		hashmap=new HashMap<Integer,Member>();
	}
	public void addMember(Member member) {
		hashmap.put(member.getMemberID(),member);
	}
	
	public boolean removeMember(int memberID) {
		if(hashmap.containsKey(memberID)) {
			hashmap.remove(memberID);
			return true;
		}	
		System.out.println(memberID+"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir=hashmap.keySet().iterator();
		while(ir.hasNext()) {
			int key=ir.next();
			Member member=hashmap.get(key);
			System.out.println(member);
		}
	}
}
