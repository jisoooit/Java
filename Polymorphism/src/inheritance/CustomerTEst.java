package inheritance;

public class CustomerTEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� Ŭ���� �����ɶ� �׻� ������ �����ǰ� ������ �����ȴ�.
		
		Customer customerLee=new Customer();
		customerLee.setCustomerID(10100);
		customerLee.setCustomerName("Lee");
		
		VIPCustomer customerKim=new VIPCustomer();
		customerKim.setCustomerID(10101);
		customerKim.setCustomerName("Kim");
		customerKim.bonusPoint=100;
		
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());

		//��ĳ�����̴�. ����Ŭ���� Ÿ������ ����ȯ�� �ȴ�. 
		//�̰� ������ ������ vip�� customer�� ���� �� ������ �ֱ� ����
		Customer customerJ=new VIPCustomer(10102,"J",20202);
		customerJ.bonusPoint=1000;
		//customerJ.agentID - ����  
		//Customer Ŭ������ ��������� �޼ҵ常 ��밡���ϴ�.
		
//		Customer customerG=new GoldCustomer();
//		customerG.bonusPoint=1000;
//		System.out.println(customerG.showCustomerInfo());
	}

}
