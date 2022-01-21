package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	//throws는 예외 처리 미루는 것
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream(fileName);
		Class c=Class.forName(className);
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsException ex=new ThrowsException(); //throw는 에러를 넘기는 거임. 실행되는 쪽에서 에러 처리
		try {
			ex.loadClass("b.txt","java.lang.string"); //a, S로 바꾸면 에러 없음
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch(Exception e) { //얘는 최상위 클래스기 때문에 쓰려면 맨 마지막에 쓰는 것. 
			System.out.println(e);
		}
		System.out.println("end");
	}

}
