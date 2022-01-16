package abstractex;

public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("DeskTop display");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop typing");
		
	}
	
	public void turnOn() {
		System.out.println("데스크탑 전원 킨다.");
	}
}
