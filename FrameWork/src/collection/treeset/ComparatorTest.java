package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		return str1.compareTo(str2)*(-1);
		//string은 compareto가 이미 구현되어있다. -1곱하면 내림차순
	}
}
public class ComparatorTest {
	public static void main(String[] args) {
		//comparable방식 바꾸고 싶을때 comparator쓴다.
		//이렇게 하면 비교방식 mycompare쓰라는거임. 
		TreeSet<String> tree=new TreeSet<String>(new MyCompare());
		tree.add("aa");
		tree.add("cc");
		tree.add("bb");
		System.out.println(tree);
	}
}
