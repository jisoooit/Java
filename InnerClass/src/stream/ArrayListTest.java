package stream;

import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> sList=new ArrayList<String>();
		sList.add("Tomas");
		sList.add("James");
		sList.add("Edward");
		Stream<String> stream=sList.stream();
		stream.forEach(s->System.out.println(s)); //요소들 하나씩 출력해라
	
		sList.stream().sorted().forEach(s->System.out.println(s));
		
//		for(String s:sList) {
//			System.out.println(s);
//		}
		
		
	}

}
