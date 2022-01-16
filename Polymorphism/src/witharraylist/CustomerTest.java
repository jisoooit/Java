package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> customerList=new ArrayList<Customer>();
		Customer Lee=new Customer(10010,"�̼���");
		Customer Shin=new Customer(10011,"�Ż��Ӵ�");
		GoldCustomer Hong=new GoldCustomer(10012,"ȫ�浿");
		GoldCustomer Yul=new GoldCustomer(10013,"������");
		VIPCustomer Kim=new VIPCustomer(10014,"������",12345);
		
		customerList.add(Lee);
		customerList.add(Shin);
		customerList.add(Hong);
		customerList.add(Yul);
		customerList.add(Kim);
		
		System.out.println("========������ ��� =========");
		
		for(Customer customer:customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("======�������� ���ʽ� ����Ʈ ���=======");
		int price=10000;
		for(Customer customer:customerList) {
			int cost=customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"����"+cost+"�� �����ϼ̽��ϴ�.");
			System.out.println(customer.showCustomerInfo());
		}
		
	}

}
