package cooperation;

public class Subway {
	int lineNum;
	int passengerCount;
	int money;
	
	public Subway(int lineNum) {
		this.lineNum=lineNum;
	}
	public void take(int money) {
		passengerCount++;
		this.money+=money;
	}
	
	public void showInfo() {
		System.out.println("����ö"+lineNum+"���� �°���"+passengerCount+"���̰�, ������"+money+"�Դϴ�");
	}
}
