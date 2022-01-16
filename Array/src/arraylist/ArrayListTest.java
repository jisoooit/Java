package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ctrl+shift+o하면 import생김
		//ArrayList위에 마우스대고 f1누르면 help볼 수 있다.
		ArrayList<String> list=new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(String s:list) {
			System.out.println(s);
		}
	}

}
