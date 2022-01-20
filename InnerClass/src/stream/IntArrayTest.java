package stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5};
		
		int sum=Arrays.stream(arr).sum();
		System.out.println(sum);
		
	}

}
