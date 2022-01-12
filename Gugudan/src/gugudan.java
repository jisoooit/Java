import java.util.Scanner;

public class gugudan {
	public static int[] cal(int times) {
		int result[]=new int[9];
		for(int i=0;i<result.length;i++) {
			result[i]=times*(i+1);
		}
		return result;
	}
	public static void print(int[] result) {
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("2단");
//		System.out.println(2*1);
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);
//		System.out.println(2*10);
//	
//	
//		System.out.println("3단");
//		System.out.println(3*1);
//		System.out.println(3*2);
//		System.out.println(3*3);
//		System.out.println(3*4);
//		System.out.println(3*5);
//		System.out.println(3*6);
//		System.out.println(3*7);
//		System.out.println(3*8);
//		System.out.println(3*9);
//		System.out.println(3*10);
		
//		Scanner scanner=new Scanner(System.in);
//		int num=scanner.nextInt();
//		System.out.println(num*1);
//		System.out.println(num*2);
//		System.out.println(num*3);
//		System.out.println(num*4);
//		System.out.println(num*5);
//		System.out.println(num*6);
//		System.out.println(num*7);
//		System.out.println(num*8);
//		System.out.println(num*9);
//		System.out.println(num*10);
//		
//		int m=1;
//		while(m<10) {
//			System.out.println(6*m);
//			m++;
//		}
//		for(int i=1;i<10;i++) {
//			System.out.println(7*i);
//		}
		
//		Scanner scanner=new Scanner(System.in);
//		int num2=scanner.nextInt();
//		if(num2>=2 && num2<10) {
//			for(int i=1;i<10;i++) {
//				System.out.println(num2*i);
//			}
//		}
//		else {
//			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
//		}
		
		//이중반복문 전체 구구단
//		int [] result=new int[9];
//		for(int j=2;j<10;j++) {
//			for(int i=0;i<result.length;i++) {
//				result[i]=j*(i+1);
//			}
//			for(int i=0;i<result.length;i++) {
//				System.out.println(result[i]);
//			}
//		}
		
		//메소드 전체 구구단
//		for(int i=2;i<10;i++) {
//			print(cal(i));
//		}
		
		Scanner scan=new Scanner(System.in);
		String inputValue=scan.nextLine();
		String [] inputArr=inputValue.split(",");
		int f=Integer.parseInt(inputArr[0]);
		int s=Integer.parseInt(inputArr[1]);
		for(int i=2;i<=f;i++) {
			for(int j=1;j<=s;j++) {
				System.out.println(i*j);
			}
		}
	}
}
