package array;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []numbers=new int[] {0,1,2};
		int []numbers=new int[3];
		numbers[0]=1;
		numbers[1]=2;
		numbers[2]=3;
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		//int배열 초기값은 0, double은 0.0, 객체배열은 null
		int [] id=new int[5];
		for(int i=0;i<id.length;i++) {
			System.out.println(id[i]);
		}
		
		//문자열배열
		char[] alpabets=new char[26];
		char ch='A';
		for(int i=0;i<alpabets.length;i++,ch++) {
			alpabets[i]=ch;
		}
		for(int i=0;i<alpabets.length;i++,ch++) {
			System.out.println(alpabets[i]);
		}
	}

}
