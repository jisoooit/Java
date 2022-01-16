package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> customerList=new ArrayList<Customer>();
		Customer Lee=new Customer(10010,"이순신");
		Customer Shin=new Customer(10011,"신사임당");
		GoldCustomer Hong=new GoldCustomer(10012,"홍길동");
		GoldCustomer Yul=new GoldCustomer(10013,"이율곡");
		VIPCustomer Kim=new VIPCustomer(10014,"김유신",12345);
		
		customerList.add(Lee);
		customerList.add(Shin);
		customerList.add(Hong);
		customerList.add(Yul);
		customerList.add(Kim);
		
		System.out.println("========고객정보 출력 =========");
		
		for(Customer customer:customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("======할인율과 보너스 포인트 결과=======");
		int price=10000;
		for(Customer customer:customerList) {
			int cost=customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"님이"+cost+"를 지불하셨습니다.");
			System.out.println(customer.showCustomerInfo());
		}
		
	}

}
