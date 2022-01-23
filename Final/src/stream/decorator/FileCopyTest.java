package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long millisecons=0;
		int len=0;
		try(FileInputStream fis=new FileInputStream("a.exe");
				FileOutputStream fos=new FileOutputStream("b.exe");
				BufferedInputStream bis=new BufferedInputStream(fis);
				BufferedOutputStream bos=new BufferedOutputStream(fos)){
			millisecons=System.currentTimeMillis();
			int i;
			while((i=fis.read())!=-1) {
				bos.write(i);
				len++;
			}
			millisecons=System.currentTimeMillis()-millisecons;
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println(len);
		System.out.println(millisecons);
	}

}
