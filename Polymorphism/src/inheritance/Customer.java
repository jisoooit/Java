package inheritance;

public class Customer {
	
	//protected -같 패키지내에서 볼 수 있다. 상속관계에서는 가시성이 있게 된다.상속관계면 패키지 달라도
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
	public Customer() {
		customerGrade="silver";
		bonusRatio=0.01;
		
		//하위 호출될때 상위 먼저 호출되고 하위 호출된다.
		System.out.println("Custermer()호출");
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
		return customerName+"님의 등급은"+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"입니다.";
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
