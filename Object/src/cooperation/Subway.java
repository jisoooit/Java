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
		System.out.println("지하철"+lineNum+"번의 승객은"+passengerCount+"명이고, 수입은"+money+"입니다");
	}
}
