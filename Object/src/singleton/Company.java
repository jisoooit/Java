package singleton;

public class Company {
	//�ν��Ͻ� �� �ϳ��� ������ �� �ְ� ����.. �̰� singleton
	//�������� ��������� �ȵɶ� ����Ѵ�.
	//�����ϰ� ���� instance��.
	private static Company instance=new Company();
	private Company(){
		//�ܺο��� �� constructor�� ȣ�� �� �� ���� �ϰڴ�.
	}
	public static Company getInstance() {
		//������ ���� ���� �޼ҵ�
		return instance;
	}
}
