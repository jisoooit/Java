package interfaceex;

public interface Calc {
	//인터펲이스에는 상수와 추상메소드가 선언된다. 
	
	//아무런 키워드 쓰지 않아도 상수 선언 된다. 
	double PI=3.14;
	int ERROR=-99999999;
	
	//인터페이스 안에 선언된건 다 추상메소드
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
