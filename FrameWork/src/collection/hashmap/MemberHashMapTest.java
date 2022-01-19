package collection.hashmap;

import collection.Member;
import collection.treeset.MemberTreeSet;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap hashmap=new MemberHashMap();
		
		Member memLee=new Member(102,"이순신");
		Member memKim=new Member(101,"김유신");
		Member memShin=new Member(103,"신사임당");
		
		hashmap.addMember(memLee);
		hashmap.addMember(memKim);
		hashmap.addMember(memShin);
		
		hashmap.showAllMember();
		
		hashmap.removeMember(102);
		hashmap.showAllMember();

	}

}
