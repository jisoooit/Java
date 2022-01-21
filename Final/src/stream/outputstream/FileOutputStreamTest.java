package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	public static void main(String[] args) {
		
		byte[] bs=new byte[26];
		byte data=65;
		for(int i=0;i<bs.length;i++) {
			bs[i]=data++;
		}
		
		try(FileOutputStream fos=new FileOutputStream("output2.txt",false)) { //true�ϸ� overwrite���� �ʰ� �̾�� ������.false�� default��
			fos.write(bs);
			//for.write(bs,2,10) - 3�������� 10���� ���
//			fos.write(65); //�� ���� �ƽ�Ű�ڵ� ���� ������� ���ڸ� ����ش�.
//			fos.write(66);
//			fos.write(67);
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
				
	}
}
