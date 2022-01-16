package inheritance;

public class VIPCustomer extends Customer{
	
	private int agentID;
	private double saleRatio;
	
	public VIPCustomer() {
		//super(); �̰� �츮�� ������ ���ִ�. ���⼱ �⺻ ����Ŭ���� ������()��
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
		
		System.out.println("VIPCustermer()ȣ��");
	}
	public VIPCustomer(int customerID, String cutomerName,int agentID) {
		//�ٵ� ���࿡ ����Ŭ���� �⺻ �����ڰ� ������ �̷��� �ؾ�
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
