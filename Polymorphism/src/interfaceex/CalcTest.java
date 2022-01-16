package interfaceex;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=2;
		Calc calc=new CompleteCalc(); //이렇게 쓸 수 있다.
		
		//이건 안된다. 
//		Calc calc1=new Calc();
//		Calc calc2=new Calculator();
		System.out.println(calc.add(num1, num2));
		
		//calc.showInfo(); 이건 안된다. 타입이 Calc니까.
	}

}
