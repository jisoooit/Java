package array;

public class ObjectCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book[] bookArray1=new book[3];
		book[] bookArray2=new book[3];
		book[] bookArray3=new book[3];
		
		bookArray1[0]=new book("a1","������");
		bookArray1[1]=new book("a1","������");
		bookArray1[2]=new book("a1","������");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("b");
		bookArray1[0].setAuthor("�ڿϼ�");
		
		//���� ����Ȱ� �ƴϰ� �ּҰ� ����(��������) �Ǿ��⶧���� �ϳ����� �����ϸ� �Ѵ� ����
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookInfo();
		}
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
		
		//��������
		
		bookArray3[0]=new book();
		bookArray3[1]=new book();
		bookArray3[2]=new book();
		
		for(int i=0;i<bookArray1.length;i++) {
			bookArray3[i].setAuthor(bookArray1[i].getAuthor());
			bookArray3[i].setBookName(bookArray1[i].getBookName());
		}
		
		bookArray1[0].setBookName("c");
		bookArray1[0].setAuthor("�ڿϱ�");
		
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookInfo();
		}
		for(int i=0;i<bookArray3.length;i++) {
			bookArray3[i].showBookInfo();
		}
		
		//���� for��
		//ó������ ������ �� ��������� �̷��� �� �� �ִ�.int�迭�� ����~
		String[] strArr= {"JAVA","Android","C"};
		for(String s:strArr) {
			System.out.println(s);
		}
	}

}
