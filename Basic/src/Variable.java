
public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bData=-128;
		System.out.println(bData);
		
		byte bData2=127;
		System.out.println(bData2);
		
		long num=12345678900L;
		//8����Ʈ�� 8����Ʈ��� �˷�����ؼ� L�� ���δ�. 
		
		char ch='A';
		System.out.println(ch);
		System.out.println((int)ch);
		
		ch=66;
		System.out.println(ch);
		
		int ch2=67;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		//�Ǽ���
		double dNum=3.14;
		float fNum=3.14F;
		
		//���
		final int MAX_NUM=10;
		final float PI=3.14f;
		
		//���� ������ ū��, �������� �Ǽ� ����ȯ�� �ڿ������� �ȴ�.
		byte bNum=10;
		int n=bNum;
		System.out.println(n);
		
		long lNum=10;
		float fnum=lNum;
		
		System.out.println(fnum);
		
		double dnum=fnum+n;
		System.out.println(dnum);
		
		//ū������ �������� ����ȯ ������Ѵ�.
		int inum=1000;
		byte bNum2=(byte)inum;
		
		System.out.println(bNum2);
		
		double d=3.14;
		inum=(int)d;
		System.out.println(inum);
		float f=0.9F;
		
		int num1=(int)d+(int)f;
		int num2=(int)(d+f);
		System.out.println(num1);
		System.out.println(num2);
	}

}
