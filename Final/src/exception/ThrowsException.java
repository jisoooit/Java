package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	//throws�� ���� ó�� �̷�� ��
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream(fileName);
		Class c=Class.forName(className);
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsException ex=new ThrowsException(); //throw�� ������ �ѱ�� ����. ����Ǵ� �ʿ��� ���� ó��
		try {
			ex.loadClass("b.txt","java.lang.string"); //a, S�� �ٲٸ� ���� ����
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch(Exception e) { //��� �ֻ��� Ŭ������ ������ ������ �� �������� ���� ��. 
			System.out.println(e);
		}
		System.out.println("end");
	}

}
