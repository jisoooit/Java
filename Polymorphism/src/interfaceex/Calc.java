package interfaceex;

public interface Calc {
	//���ͼ��̽����� ����� �߻�޼ҵ尡 ����ȴ�. ����Ʈ, ����, private �޼ҵ� ����
	
	//�ƹ��� Ű���� ���� �ʾƵ� ��� ���� �ȴ�. 
	double PI=3.14;
	int ERROR=-99999999;
	
	//�������̽� �ȿ� ����Ȱ� �� �߻�޼ҵ�
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("�������⸦ �����մϴ�.");
	}
	
	static int total(int[] arr) {
		int total=0;
		for(int i:arr) {
			total+=i;
		}
		return total;
	}
	
	//private�޼ҵ�� �������̽� �������� ����� �����ϱ����� ����.
}
