package lambda;

@FunctionalInterface //람다식을 선언하기 위한 인터페이스
public interface MyNumber {
	//함수형을 위해서 메서드를 딱 하나만 선언해야 한다. 
	int getMaxNum(int num1, int num2);
	
}
