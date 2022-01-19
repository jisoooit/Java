package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashSet hashset=new MemberHashSet();
		
		Member memLee=new Member(101,"이순신");
		Member memKim=new Member(102,"김유신");
		Member memShin=new Member(103,"신사임당");
		
		hashset.addMember(memLee);
		hashset.addMember(memKim);
		hashset.addMember(memShin);
		
		hashset.showAll();
		Member memLee2=new Member(101,"이몽룡");
		hashset.addMember(memLee2);
		hashset.showAll();
		
		//같은 id는 들어가면 안된다. member에 equals랑 hashcode를 구현해야 기존에 거랑 같은지 체크한다.
		//string은 이미 e,h가 구현되어있다. 우리가 만든것들은 구현해야함
	}

}
