package string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("abc");
		String str2=new String("abc");
		
		System.out.println(str1==str2);
		
		//�ΰ��� ������ �޸𸮸� ����Ű�� �ȴ�.
		String str3="abc";
		String str4="abc";
		
		System.out.println(str3==str4);
		
		String st1=new String("java");
		String st2=new String("android");
		
		System.out.println(System.identityHashCode(st1));
		//���� �ִ� st1�� ����Ǵ°� �ƴ϶� ������ �Ǹ� st1�� ����� ���� �ִ� ���ο� ��ġ�� ����ġ�� �ȴ�.
		st1=st1.concat(st2);
		System.out.println(System.identityHashCode(st1));
		
		System.out.println(st1);
	}

}
