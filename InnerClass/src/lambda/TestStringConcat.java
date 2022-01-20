package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringConcatImpl s=new StringConcatImpl();
		s.makeStirng("hello", "java");
		
		//람다식으로 하면
		StringConcat concat=(s1,s2)->System.out.println(s1+" "+s2);
		concat.makeStirng("hello","java");
		
		//위의 람다식이랑 같다.
//		StringConcat concat2=new 
	}

}
