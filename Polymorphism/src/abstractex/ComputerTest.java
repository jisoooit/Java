package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//오류가 난다. abstract클래스는 생성될 수없다.
		//Computer c1=new Computer();
		//Computer c3=new NoteBook();
		Computer c2=new DeskTop();
		Computer c4=new MyNoteBook();
		
		c2.display();
		c4.display();
		
		c2.turnOn();
		
		//문법적으로 모든 메소드 구현되어있지만 abstract를 클래스앞에 붙이면 abstract클래스가 되어 new로 생성할 수 없다.
	}

}
