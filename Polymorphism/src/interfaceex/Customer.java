package interfaceex;

public class Customer implements Buy,Sell{

	@Override
	public void Sell() {
		System.out.println("�Ǹ��ϱ�");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("�����ϱ�");
	}

	@Override
	public void order() {
		System.out.println("�� �Ǹ� �ֹ�");
	}
	

}
