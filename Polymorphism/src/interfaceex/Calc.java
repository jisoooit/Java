package interfaceex;

public interface Calc {
	//인터펲이스에는 상수와 추상메소드가 선언된다. 디폴트, 정적, private 메소드 가능
	
	//아무런 키워드 쓰지 않아도 상수 선언 된다. 
	double PI=3.14;
	int ERROR=-99999999;
	
	//인터페이스 안에 선언된건 다 추상메소드
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("정수계산기를 구현합니다.");
	}
	
	static int total(int[] arr) {
		int total=0;
		for(int i:arr) {
			total+=i;
		}
		return total;
	}
	
	//private메소드는 인터페이스 내에서만 기능을 제공하기위해 쓴다.
}
