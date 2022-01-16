package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public abstract void wipe();
	
	//이건 구현을 이미 한 코드다. 필요에 의해 재정의를 할때, 꼭 안해도 될때 이런식으로
	public void washCar() {};
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//이 templtae메소드(시나리오)는 변하면 안된다. 그래서 final을 붙임. 하위클래스에서 재정의할 수 없음.
	//이게 template 메소드다. 일련의 과정을 시나리오로 만들어놓은 메소드.
	public final void run() {
		startCar();
		drive();
		wipe();
		stop();
		washCar();
		turnOff();
	}
}
