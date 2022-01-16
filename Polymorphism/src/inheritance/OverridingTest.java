package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customerLee=new Customer(100010, "LEE");
		int price=customerLee.calcPrice(10000);
		System.out.println("지불금액은"+price+"이고, "+ customerLee.showCustomerInfo());
		
		VIPCustomer customerKim=new VIPCustomer(100010, "Kim",100);
		price=customerKim.calcPrice(10000);
		System.out.println("지불금액은"+price+"이고, "+ customerKim.showCustomerInfo());
	
		Customer customerWho=new VIPCustomer(100011, "Who", 100);
		price=customerWho.calcPrice(10000);
		//참조변수는 customer(타입)것만 참조할 수 있는데
		//불리는건 vipcustomer의 calc이 불린다. 
		//재정의된 메소드가 불린다 !!
		System.out.println("지불금액은"+price+"이고, "+ customerWho.showCustomerInfo());
	}

}
