package thisex;

class Person{
	String name;
	int age;
	
	public Person() {
		//this앞에 문장 없어야 한다. 
		this("이름없음",1);
	}
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public Person returnSelf() {
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		System.out.println(p1.name);
		System.out.println(p1.returnSelf());
		
	}

}
