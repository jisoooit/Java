package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("finally");
		}
		System.out.println("end");
		
		
		//finally��� �ڵ����� close�ȴ�. 
		try(FileInputStream fis2=new FileInputStream("a.txt")) {
		
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
