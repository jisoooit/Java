package collection.treemap;

import collection.Member;
import collection.treeset.MemberTreeSet;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap treemap=new MemberTreeMap();
		
		Member memLee=new Member(102,"이순신");
		Member memKim=new Member(101,"김유신");
		Member memShin=new Member(103,"신사임당");
		
		treemap.addMember(memLee);
		treemap.addMember(memKim);
		treemap.addMember(memShin);
		
		//얘는 정렬이 되어서 출력된다.
		treemap.showAllMember();
		
//		treemap.removeMember(102);
//		treemap.showAllMember();

	}

}
