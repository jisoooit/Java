package array;

public class ObjectCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book[] bookArray1=new book[3];
		book[] bookArray2=new book[3];
		book[] bookArray3=new book[3];
		
		bookArray1[0]=new book("a1","조정래");
		bookArray1[1]=new book("a1","조정래");
		bookArray1[2]=new book("a1","조정래");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("b");
		bookArray1[0].setAuthor("박완서");
		
		//값이 복사된게 아니고 주소가 복사(얉은복사) 되었기때문에 하나에서 변경하면 둘다 변함
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookInfo();
		}
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
		
		//깊은복사
		
		bookArray3[0]=new book();
		bookArray3[1]=new book();
		bookArray3[2]=new book();
		
		for(int i=0;i<bookArray1.length;i++) {
			bookArray3[i].setAuthor(bookArray1[i].getAuthor());
			bookArray3[i].setBookName(bookArray1[i].getBookName());
		}
		
		bookArray1[0].setBookName("c");
		bookArray1[0].setAuthor("박완규");
		
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookInfo();
		}
		for(int i=0;i<bookArray3.length;i++) {
			bookArray3[i].showBookInfo();
		}
		
		//향상된 for문
		//처음부터 끝까지 다 돌고싶을때 이렇게 할 수 있다.int배열도 가능~
		String[] strArr= {"JAVA","Android","C"};
		for(String s:strArr) {
			System.out.println(s);
		}
	}

}
