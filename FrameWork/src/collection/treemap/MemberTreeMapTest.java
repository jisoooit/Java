package collection.treemap;

import collection.Member;
import collection.treeset.MemberTreeSet;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap treemap=new MemberTreeMap();
		
		Member memLee=new Member(102,"�̼���");
		Member memKim=new Member(101,"������");
		Member memShin=new Member(103,"�Ż��Ӵ�");
		
		treemap.addMember(memLee);
		treemap.addMember(memKim);
		treemap.addMember(memShin);
		
		//��� ������ �Ǿ ��µȴ�.
		treemap.showAllMember();
		
//		treemap.removeMember(102);
//		treemap.showAllMember();

	}

}
