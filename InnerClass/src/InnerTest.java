class OutClass{
	
	int num=1;
	private static int sNum=20;
	private InClass inClass;
	
	public OutClass() { //실제 생성은 생성자에서 많이 한다.
		inClass=new InClass();
	}
	class InClass{
		int inNum=200;
		
		void inTest() {
			System.out.println(num); //private,정적변수 쓸수있음(쩡적변수, 메서드 선언은 못해)
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
			//num+=10; 사용못함
			sNum+=10;
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sINum);
		}
		static void sTest() {
			System.out.println(sNum);
			//System.out.println(iNum); 사용못함
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
