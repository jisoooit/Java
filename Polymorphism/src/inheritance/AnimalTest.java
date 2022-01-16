package inheritance;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eager extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	public void flying() {
		System.out.println("�ϴ��� ���ư��ϴ�.");
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

	public void moveAnimal(Animal animal) {	//�Ű� ������ �ڷ����� ���� Ŭ����
		//�� �ڵ� ���ٿ� ���� ����� �پ��ϴ�. �̰� ������
		animal.move();
		//�����ǵ� �޼ҵ尡 ȣ��ȴ�.
		
		//�ٿ�ĳ���� �ؾ� human�� �޼ҵ带 ����� �� �ִ�. instance�� Ÿ�� üũ�ؾ� ���� ���� ����
		if(animal instanceof Human) {
			Human human=(Human)animal;
			human.readBook();
		}
		else if(animal instanceof Tiger) {
			Tiger tiger=(Tiger)animal;
			tiger.hunting();
		}
		else if(animal instanceof Eager) {
			Eager eager=(Eager)animal;
			eager.flying();
		}else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
	}
}