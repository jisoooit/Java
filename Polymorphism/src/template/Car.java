package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public abstract void wipe();
	
	//�̰� ������ �̹� �� �ڵ��. �ʿ信 ���� �����Ǹ� �Ҷ�, �� ���ص� �ɶ� �̷�������
	public void washCar() {};
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	//�� templtae�޼ҵ�(�ó�����)�� ���ϸ� �ȵȴ�. �׷��� final�� ����. ����Ŭ�������� �������� �� ����.
	//�̰� template �޼ҵ��. �Ϸ��� ������ �ó������� �������� �޼ҵ�.
	public final void run() {
		startCar();
		drive();
		wipe();
		stop();
		washCar();
		turnOff();
	}
}
