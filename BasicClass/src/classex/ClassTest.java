package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Person person=new Person();
		
		//getClass는 object메서드다.
		Class pClass=person.getClass();
		System.out.println(pClass.getName());
		
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		
		//이 이름의 클래스가 있으면 메모리에 로딩시킨다. 동적로딩.
		Class pClass3=Class.forName("classex.Person");
		System.out.println(pClass3.getName());
	
	}

}
