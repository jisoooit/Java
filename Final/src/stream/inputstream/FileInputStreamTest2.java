package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis=new FileInputStream("a.txt")){
				byte[] bs=new byte[10];
				int i;
				while((i=fis.read(bs))!=-1) { //bs�� �о��
					for(int j=0;j<i;j++) { //���� ���� �̿��ؼ� ����ϰ� ��°���
						System.out.print((char)bs[j]);
					}
					System.out.println();
				}
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
