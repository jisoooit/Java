package inheritance;

public class CustomerTEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//하위 클래스 생성될때 항상 상위가 생성되고 하위가 생성된다.
		
		Customer customerLee=new Customer();
		customerLee.setCustomerID(10100);
		customerLee.setCustomerName("Lee");
		
		VIPCustomer customerKim=new VIPCustomer();
		customerKim.setCustomerID(10101);
		customerKim.setCustomerName("Kim");
		customerKim.bonusPoint=100;
		
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());

		//업캐스팅이다. 상위클래스 타입으로 형변환이 된다. 
		//이게 가능한 이유는 vip는 customer의 것을 다 가지고 있기 때문
		Customer customerJ=new VIPCustomer(10102,"J",20202);
		customerJ.bonusPoint=1000;
		//customerJ.agentID - 오류  
		//Customer 클래스의 멤버변수와 메소드만 사용가능하다.
		
//		Customer customerG=new GoldCustomer();
//		customerG.bonusPoint=1000;
//		System.out.println(customerG.showCustomerInfo());
	}

}
