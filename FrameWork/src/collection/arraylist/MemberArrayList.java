package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList=new ArrayList<Member>(); //주로 생성자에서 생성한다.
	}
	public void addMember(Member member) {
		arrayList.add(member);
	}
	public boolean removeMember(int memberID) {
//		for(int i=0;i<arrayList.size();i++) {
//			Member member=arrayList.get(i);
//			int tempID=member.getMemberID();
//			if (memberID==tempID) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
		//iterator는 순서없는 set같은거에 쓰인다.
		Iterator<Member> iterator =arrayList.iterator();
		while(iterator.hasNext()){
			Member member=iterator.next();
			int tempID=member.getMemberID();
			if (memberID==tempID) {
				arrayList.remove(member); //remove는 인덱스 보고 지우는거, object자체 보고 지우는거 다 가능하다.
				return true;
			}
		}
		
		System.out.println(memberID+"가 존재하지 않습니다.");
		return false;
	}
	public void showAll() {
		for(Member member:arrayList) {
			System.out.println(member); //toString 재정의 했으니까
		}
		//System.out.println(arrayList); //이미 구현되어있다. 모든멤버, 
	}
}
