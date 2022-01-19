class Outer{
	
	int outNum=100;
	static int sNum=200;
	
	Runnable runnable=new Runnable() {
		public void run() {
			System.out.println("runnable");
		}
	};
	
	public Runnable getRunnable(int i) {
		int localnum=100;
		
		return new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localnum);

		}
	};
//		class MyRunnable implements Runnable{
//
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				//이 2개는 오류가 난다.(지역변수) 사용하는건 상관없지만 변화시킬 수 없다.final로 선언되어있다고 볼수있다.
////				localnum+=100;
////				i+=200;
//				System.out.println(outNum);
//				System.out.println(sNum);
//				System.out.println(localnum);
//				System.out.println(i);
//			}
//			
//		}
//		return new MyRunnable();
	
	}
}
public class LocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer=new Outer();
		Runnable run=outer.getRunnable(20);
		run.run();
		
		outer.runnable.run();
	}

}
