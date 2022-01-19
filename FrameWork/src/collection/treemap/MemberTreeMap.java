package collection.treemap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {
	private TreeMap<Integer,Member> treeMap;
	public MemberTreeMap() {
		treeMap=new TreeMap<Integer,Member>();
	}
	public void addMember(Member member) {
		//interger도 comparable이 이미 구현되어있다. 바꾸고싶으면 comparator로 바꾸면 됨
		treeMap.put(member.getMemberID(),member);
	}
	
	public boolean removeMember(int memberID) {
		if(treeMap.containsKey(memberID)) {
			treeMap.remove(memberID);
			return true;
		}	
		System.out.println(memberID+"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir=treeMap.keySet().iterator();
		while(ir.hasNext()) {
			int key=ir.next();
			Member member=treeMap.get(key);
			System.out.println(member);
		}
	}
}
