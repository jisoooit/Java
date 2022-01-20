package lambda;

interface PrintString{
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintString lp=str->System.out.println(str);
		lp.showString("test");
		
		showMyString(lp);
		
		PrintString reStr=returnPrint();
		reStr.showString("HEllo");
	}
	public static void showMyString(PrintString lambda) {
		lambda.showString("test2");
	}
	
	public static PrintString returnPrint() {
		return s->System.out.println(s+" word");
	}
}
