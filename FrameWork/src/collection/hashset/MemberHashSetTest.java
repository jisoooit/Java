package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberHashSet hashset=new MemberHashSet();
		
		Member memLee=new Member(101,"�̼���");
		Member memKim=new Member(102,"������");
		Member memShin=new Member(103,"�Ż��Ӵ�");
		
		hashset.addMember(memLee);
		hashset.addMember(memKim);
		hashset.addMember(memShin);
		
		hashset.showAll();
		Member memLee2=new Member(101,"�̸���");
		hashset.addMember(memLee2);
		hashset.showAll();
		
		//���� id�� ���� �ȵȴ�. member�� equals�� hashcode�� �����ؾ� ������ �Ŷ� ������ üũ�Ѵ�.
		//string�� �̹� e,h�� �����Ǿ��ִ�. �츮�� ����͵��� �����ؾ���
	}

}
