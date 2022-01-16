package inheritance;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eager extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("하늘을 날아갑니다.");
	}
}

public class AnimalTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalTest test=new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eager());
		
		//Animal a=new Human();
		
		Animal[] animalList=new Animal[3];
		animalList[0]=new Human();
		
		ArrayList<Animal> animals=new ArrayList<Animal>();
		animals.add(new Tiger());
	
	}

	public void moveAnimal(Animal animal) {	//매개 변수의 자료형이 상위 클래스
		//이 코드 한줄에 대한 결과가 다양하다. 이게 다형성
		animal.move();
		//재정의된 메소드가 호출된다.
		
		//다운캐스팅 해야 human의 메소드를 사용할 수 있다. instance로 타입 체크해야 오류 방지 가능
		if(animal instanceof Human) {
			Human human=(Human)animal;
			human.readBook();
		}
		else if(animal instanceof Tiger) {
			Tiger tiger=(Tiger)animal;
			tiger.hunting();;
		}
		else if(animal instanceof Eager) {
			Eager eager=(Eager)animal;
			eager.flying();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
		}
	}
}
