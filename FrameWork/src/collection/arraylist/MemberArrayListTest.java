package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberArrayList memArrayList=new MemberArrayList();
		
		Member memLee=new Member(101,"�̼���");
		Member memKim=new Member(102,"������");
		Member memShin=new Member(103,"�Ż��Ӵ�");
		
		memArrayList.addMember(memLee);
		memArrayList.addMember(memKim);
		memArrayList.addMember(memShin);
		
		memArrayList.showAll();
		
		memArrayList.removeMember(memLee.getMemberID());
		memArrayList.showAll();
	}

}
