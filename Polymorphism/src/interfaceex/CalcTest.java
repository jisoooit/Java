package interfaceex;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=2;
		Calc calc=new CompleteCalc(); //�̷��� �� �� �ִ�.
		
		//�̰� �ȵȴ�. 
//		Calc calc1=new Calc();
//		Calc calc2=new Calculator();
		System.out.println(calc.add(num1, num2));
		
		//calc.showInfo(); �̰� �ȵȴ�. Ÿ���� Calc�ϱ�.
	}

}