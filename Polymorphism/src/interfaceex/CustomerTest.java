package interfaceex;

public class CustomerTest {
	
	public static void main(String[] args) {
		Customer customer=new Customer();
		Buy buyC=customer;
		buyC.buy();
		
		Sell sellC=customer;
		sellC.Sell();
		
		
		//�ν��Ͻ��� �޼ҵ�, �������̵��� �޼ҵ尡 �Ҹ���.
		customer.order();
		buyC.order();
		sellC.order();
	}
	
}
