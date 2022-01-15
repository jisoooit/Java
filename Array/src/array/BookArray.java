package array;

public class BookArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체 배열
		book[] library=new book[5];
		library[0]=new book("a1","조정래");
		library[1]=new book("a2","조정래");
		library[2]=new book("a3","조정래");
		library[3]=new book("a4","조정래");
		library[4]=new book("a5","조정래");
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i]);
		}
		for(int i=0;i<library.length;i++) {
			library[i].showBookInfo();
		}
	}

}
