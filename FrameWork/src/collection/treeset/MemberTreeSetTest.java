package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberTreeSet treeset=new MemberTreeSet();
		
		Member memLee=new Member(102,"�̼���");
		Member memKim=new Member(101,"������");
		Member memShin=new Member(103,"�Ż��Ӵ�");
		
		treeset.addMember(memLee);
		treeset.addMember(memKim);
		treeset.addMember(memShin);
		
		treeset.showAll();
		Member memLee2=new Member(101,"�̸���");
		treeset.addMember(memLee2);
		treeset.showAll();
		
		//���� id�� ���� �ȵȴ�. member�� equals�� hashcode�� �����ؾ� ������ �Ŷ� ������ üũ�Ѵ�.
		//string�� �̹� e,h�� �����Ǿ��ִ�. �츮�� ����͵��� �����ؾ���
	}

}
