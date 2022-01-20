package lambda;

public interface TestMyNumber {
	public static void main(String[] args) {
		
		MyNumber maxNum=(x,y)->(x>=y)? x:y;
		int max=maxNum.getMaxNum(10, 20);
		
		System.out.println(max);
		
		MyNumber aaa=new MyNumber() {

			@Override
			public int getMaxNum(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1+num2;
			}
		};
	}
	
	
}
