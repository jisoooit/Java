package abstractex;

//ab메소드를 가지면 추상클래스다. abstract붙여줘야 한다.
public abstract class Computer {
	//구현을 안하고 메소드를 선언만
	//구현코드가 없으면 추상메소드다.
	//상속받은 하위클래스에서 구현된다.
	public abstract void display();
	public abstract void typing();
	
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
