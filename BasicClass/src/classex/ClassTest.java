package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Person person=new Person();
		
		//getClass�� object�޼����.
		Class pClass=person.getClass();
		System.out.println(pClass.getName());
		
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		
		//�� �̸��� Ŭ������ ������ �޸𸮿� �ε���Ų��. �����ε�.
		Class pClass3=Class.forName("classex.Person");
		System.out.println(pClass3.getName());
	
	}

}
