package object;

class Book{
	String title;
	String author;
	
	Book(String title,String author){
		this.title=title;
		this.author=author;
	}

	@Override
	public String toString() {
		return title+","+author;
	}
	
	
}

public class ToStringEx {

	public static void main(String[] args) {
		Book book= new Book("자바","은종");
		System.out.println(book);
		
		
		//이미 toString 재정의 있는거임
		String str=new String("test");
		System.out.println(str);
	}

}
