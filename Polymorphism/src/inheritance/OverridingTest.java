package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customerLee=new Customer(100010, "LEE");
		int price=customerLee.calcPrice(10000);
		System.out.println("���ұݾ���"+price+"�̰�, "+ customerLee.showCustomerInfo());
		
		VIPCustomer customerKim=new VIPCustomer(100010, "Kim",100);
		price=customerKim.calcPrice(10000);
		System.out.println("���ұݾ���"+price+"�̰�, "+ customerKim.showCustomerInfo());
	
		Customer customerWho=new VIPCustomer(100011, "Who", 100);
		price=customerWho.calcPrice(10000);
		//���������� customer(Ÿ��)�͸� ������ �� �ִµ�
		//�Ҹ��°� vipcustomer�� calc�� �Ҹ���. 
		//�����ǵ� �޼ҵ尡 �Ҹ��� !!
		System.out.println("���ұݾ���"+price+"�̰�, "+ customerWho.showCustomerInfo());
	}

}
