package stream.inputstream;


import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("알파벳 여러개 쓰고 엔터를 누르세요");
		int i=0;
		try {
			while((i = System.in.read())!='\n') { //sysin은 한바이트씩 읽어드리는 거다.
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
