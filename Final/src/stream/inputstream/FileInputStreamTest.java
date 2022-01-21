package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		int i=0;
		try {
			fis=new FileInputStream("a.txt"); //FileReader로 읽으면 한글 안깨짐
			while((i=fis.read())!=-1) { //바이트 단위로 읽기때문에 한글깨짐
				System.out.println((char)i);
			}
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
//			System.out.println((char)fis.read());
		}
		catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			} 
//			catch(NullPointerException e) {
//				System.out.println(e);
//			}
		}
		System.out.println("end");
	}

}
