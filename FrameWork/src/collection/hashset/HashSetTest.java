package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		
		boolean b1=set.add("aa");
		set.add("bb");
		set.add("cc");
		System.out.println(b1);
		System.out.println(set);
		
		boolean b2=set.add("aa");
		System.out.println(b2);
		System.out.println(set);

	}

}
