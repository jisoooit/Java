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
		
		try(FileOutputStream fos=new FileOutputStream("output2.txt",false)) { //true하면 overwrite하지 않고 이어써 써진다.false가 default임
			fos.write(bs);
			//for.write(bs,2,10) - 3번쨰부터 10개만 써라
//			fos.write(65); //이 숫자 아스키코드 값에 대응대는 문자를 찍어준다.
//			fos.write(66);
//			fos.write(67);
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
				
	}
}
