import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("달을 입력하시요");
		int num=scan.nextInt();
		int []month= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.printf("    <<%4d %3d>>\n",2022,num);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		
		for(int i=1;i<month[num-1];i++) {
			System.out.printf("%3d",i);
			if (i%7==0)
				System.out.println();
		}
//		System.out.println(month[num-1]);
//		System.out.println("반복횟수을 입력하시오");
//		int n=scan.nextInt();
//		
//		for(int i=0;i<n;i++) {
//			System.out.println("달을 입력하시요");
//			int num=scan.nextInt();
//			System.out.println(month[num-1]);
//		}
		
	}

}
