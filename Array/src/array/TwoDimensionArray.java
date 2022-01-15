package array;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr=new int[2][3];
		//행의 개수
		System.out.println(arr.length);
		
		//첫번째행의 길이
		System.out.println(arr[0].length);
		
		int[][] arr2= {{1,2,3},{4,5,6}};
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.println(arr2[i][j]);
			}
		}
		
		char[][] alpha=new char[13][2];
		char ch='A';
		for(int i=0;i<alpha.length;i++) {
			for(int j=0;j<alpha[i].length;j++,ch++) {
				alpha[i][j]=ch;
			}
		}
		for(int i=0;i<alpha.length;i++) {
			for(int j=0;j<alpha[i].length;j++) {
				System.out.print(alpha[i][j]);
			}
			System.out.println();
		}
 	}

}
