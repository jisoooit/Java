package inheritance;

public class Customer {
	
	//protected -�� ��Ű�������� �� �� �ִ�. ��Ӱ��迡���� ���ü��� �ְ� �ȴ�.��Ӱ���� ��Ű�� �޶�
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
	public Customer() {
		customerGrade="silver";
		bonusRatio=0.01;
		
		//���� ȣ��ɶ� ���� ���� ȣ��ǰ� ���� ȣ��ȴ�.
		System.out.println("Custermer()ȣ��");
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID=customerID;
		this.customerName=customerName;
		customerGrade="sliver";
		bonusRatio=0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint+=bonusRatio*price;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName+"���� �����"+customerGrade+"�̸�, ���ʽ� ����Ʈ�� "+bonusPoint+"�Դϴ�.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}
