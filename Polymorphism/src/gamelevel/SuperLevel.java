package gamelevel;

public class SuperLevel extends PlayerLevel{
	@Override
	public void run() {
		System.out.println("��û ���� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("��û ���� jump");
	}

	@Override
	public void turn() {
		 System.out.println("�ѹ��� turn");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***��� �����Դϴ�.***");
	}
}
