package stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(InputStreamReader fis=new InputStreamReader(new FileInputStream("a.txt"))){
			int i=0;
			while((i=fis.read())!=-1) {
				System.out.println((char)i);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	
	}

}
