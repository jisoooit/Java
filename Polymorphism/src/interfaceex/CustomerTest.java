package interfaceex;

public class CustomerTest {
	
	public static void main(String[] args) {
		Customer customer=new Customer();
		Buy buyC=customer;
		buyC.buy();
		
		Sell sellC=customer;
		sellC.Sell();
		
		
		//인스턴스의 메소드, 오버라이딩된 메소드가 불린다.
		customer.order();
		buyC.order();
		sellC.order();
	}
	
}
