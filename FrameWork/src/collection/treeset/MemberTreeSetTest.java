package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeSet treeset=new MemberTreeSet();
		
		Member memLee=new Member(102,"이순신");
		Member memKim=new Member(101,"김유신");
		Member memShin=new Member(103,"신사임당");
		
		treeset.addMember(memLee);
		treeset.addMember(memKim);
		treeset.addMember(memShin);
		
		treeset.showAll();
		Member memLee2=new Member(101,"이몽룡");
		treeset.addMember(memLee2);
		treeset.showAll();
		
		//같은 id는 들어가면 안된다. member에 equals랑 hashcode를 구현해야 기존에 거랑 같은지 체크한다.
		//string은 이미 e,h가 구현되어있다. 우리가 만든것들은 구현해야함
	}

}
