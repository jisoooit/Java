class OutClass{
	
	int num=1;
	private static int sNum=20;
	private InClass inClass;
	
	public OutClass() { //���� ������ �����ڿ��� ���� �Ѵ�.
		inClass=new InClass();
	}
	class InClass{
		int inNum=200;
		
		void inTest() {
			System.out.println(num); //private,�������� ��������(��������, �޼��� ������ ����)
			System.out.println(sNum);
		}
		
	}
	public void usingIntest() {
		inClass.inTest();
	}
	static class InStaticClass{
		int iNum=100;
		static int sINum=200;
		void inTest() {
			//num+=10; ������
			sNum+=10;
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sINum);
		}
		static void sTest() {
			System.out.println(sNum);
			//System.out.println(iNum); ������
			System.out.println(sINum);
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutClass outclass=new OutClass();
		outclass.usingIntest();
		
		OutClass.InStaticClass.sTest();
		
		OutClass.InStaticClass sinclass=new OutClass.InStaticClass();
		sinclass.inTest();
	}

}
