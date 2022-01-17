package interfaceex;

public class MyClass implements MyInterface{

	@Override
	public void X() {
		System.out.println("x()");
	}

	@Override
	public void Y() {
		// TODO Auto-generated method stub
		System.out.println("y()");
		
	}

	@Override
	public void mymethod() {
		// TODO Auto-generated method stub
		System.out.println("mymethod()");
		
	}
	
	public static void main(String[] args) {
		MyClass my=new MyClass();
		
		X x=my;
		x.X();
	}
}
