package abstractex;

//ab�޼ҵ带 ������ �߻�Ŭ������. abstract�ٿ���� �Ѵ�.
public abstract class Computer {
	//������ ���ϰ� �޼ҵ带 ����
	//�����ڵ尡 ������ �߻�޼ҵ��.
	//��ӹ��� ����Ŭ�������� �����ȴ�.
	public abstract void display();
	public abstract void typing();
	
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
