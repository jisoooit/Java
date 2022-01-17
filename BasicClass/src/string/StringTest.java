package string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("abc");
		String str2=new String("abc");
		
		System.out.println(str1==str2);
		
		//두개는 동일한 메모리를 가리키게 된다.
		String str3="abc";
		String str4="abc";
		
		System.out.println(str3==str4);
		
		String st1=new String("java");
		String st2=new String("android");
		
		System.out.println(System.identityHashCode(st1));
		//원래 있던 st1에 연결되는게 아니라 연결이 되면 st1은 연결된 것이 있는 새로운 위치를 가르치게 된다.
		st1=st1.concat(st2);
		System.out.println(System.identityHashCode(st1));
		
		System.out.println(st1);
	}

}
