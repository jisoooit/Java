package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringConcatImpl s=new StringConcatImpl();
		s.makeStirng("hello", "java");
		
		//���ٽ����� �ϸ�
		StringConcat concat=(s1,s2)->System.out.println(s1+" "+s2);
		concat.makeStirng("hello","java");
		
		//���� ���ٽ��̶� ����.
//		StringConcat concat2=new 
	}

}
