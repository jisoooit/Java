package stream.inputstream;


import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ĺ� ������ ���� ���͸� ��������");
		int i=0;
		try {
			while((i = System.in.read())!='\n') { //sysin�� �ѹ���Ʈ�� �о�帮�� �Ŵ�.
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
