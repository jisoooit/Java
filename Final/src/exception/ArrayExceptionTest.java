package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5};
		try { //이 안에서 오류가 발생된다면 , 그 오류가 인덱스 오류라면 catch문 실행
			for(int i=0;i<=5;i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e); //e.toString이 불린다.
			return; //finally수행하고 나서 수행된다. 
		}
		finally { //try수행되면 무조건 수행된다. 예외 발생하건 안하건
			System.out.println("finally");
		}
		System.out.println("end");
	}

}
