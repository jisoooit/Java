package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInOutStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileOutputStream fos=new FileOutputStream("data.txt");
				DataOutputStream dos=new DataOutputStream(fos)){
			dos.write(100);
			dos.writeInt(10);
			dos.writeChar('A');
			dos.writeUTF("hello");
		}catch(IOException e) {
			System.out.println(e);
		}
		
		//���� �״�� �о�´�.
		try(FileInputStream fis=new FileInputStream("data.txt");
				DataInputStream dis=new DataInputStream(fis)){
			System.out.println(dis.read());
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
