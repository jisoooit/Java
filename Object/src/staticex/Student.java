package staticex;

public class Student {
	
	//�ν��Ͻ����� �����ϴ� ������ static���� �����Ѵ�!!
	//���α׷��� �ε�ɶ� �����ȴ�.
	//private�� ����Ǹ� getter, setter�� ���� ����. 
	private static int serialNum=10000;
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID=serialNum;
	}

	public static int getSerialNum() {
		int i=10; //�������� - �޼ҵ� ȣ��ɶ� �����Ǽ� ������ �Ҹ�ȴ�.
		System.out.println(i);
		//studentName="ȫ�浿"; �������, �ν��Ͻ� ����
		//�̰� ��������. new�ɶ� �����Ǵµ� new���� ���ϵ� �� �޼ҵ�� ���������ϱ� ���������� ���� ���� �� ������ �־ ���� ����.
		return serialNum; //static ����, Ŭ��������
	}

	
	
	
}
