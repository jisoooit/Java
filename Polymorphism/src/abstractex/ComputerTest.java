package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//������ ����. abstractŬ������ ������ ������.
		//Computer c1=new Computer();
		//Computer c3=new NoteBook();
		Computer c2=new DeskTop();
		Computer c4=new MyNoteBook();
		
		c2.display();
		c4.display();
		
		c2.turnOn();
		
		//���������� ��� �޼ҵ� �����Ǿ������� abstract�� Ŭ�����տ� ���̸� abstractŬ������ �Ǿ� new�� ������ �� ����.
	}

}
