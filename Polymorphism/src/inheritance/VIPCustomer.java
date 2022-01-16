package inheritance;

public class VIPCustomer extends Customer{
	
	private int agentID;
	private double saleRatio;
	
	public VIPCustomer() {
		//super(); 이게 우리는 모르지만 들어가있다. 여기선 기본 상위클래스 생성자()임
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
		
		System.out.println("VIPCustermer()호출");
	}
	public VIPCustomer(int customerID, String cutomerName,int agentID) {
		//근데 만약에 상위클래스 기본 생성자가 없으면 이렇게 해야
		super(customerID,cutomerName);
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
		this.agentID=agentID;
		
		
	}
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return price-(int)(price*saleRatio);
	}
	public int getAgentID() {
		return agentID;
	}
	
}
