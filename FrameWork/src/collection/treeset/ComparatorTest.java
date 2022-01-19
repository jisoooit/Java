package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		return str1.compareTo(str2)*(-1);
		//string�� compareto�� �̹� �����Ǿ��ִ�. -1���ϸ� ��������
	}
}
public class ComparatorTest {
	public static void main(String[] args) {
		//comparable��� �ٲٰ� ������ comparator����.
		//�̷��� �ϸ� �񱳹�� mycompare����°���. 
		TreeSet<String> tree=new TreeSet<String>(new MyCompare());
		tree.add("aa");
		tree.add("cc");
		tree.add("bb");
		System.out.println(tree);
	}
}
