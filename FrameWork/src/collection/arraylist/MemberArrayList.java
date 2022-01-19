package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList=new ArrayList<Member>(); //�ַ� �����ڿ��� �����Ѵ�.
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
		//iterator�� �������� set�����ſ� ���δ�.
		Iterator<Member> iterator =arrayList.iterator();
		while(iterator.hasNext()){
			Member member=iterator.next();
			int tempID=member.getMemberID();
			if (memberID==tempID) {
				arrayList.remove(member); //remove�� �ε��� ���� ����°�, object��ü ���� ����°� �� �����ϴ�.
				return true;
			}
		}
		
		System.out.println(memberID+"�� �������� �ʽ��ϴ�.");
		return false;
	}
	public void showAll() {
		for(Member member:arrayList) {
			System.out.println(member); //toString ������ �����ϱ�
		}
		//System.out.println(arrayList); //�̹� �����Ǿ��ִ�. �����, 
	}
}
