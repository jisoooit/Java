package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5};
		try { //�� �ȿ��� ������ �߻��ȴٸ� , �� ������ �ε��� ������� catch�� ����
			for(int i=0;i<=5;i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e); //e.toString�� �Ҹ���.
			return; //finally�����ϰ� ���� ����ȴ�. 
		}
		finally { //try����Ǹ� ������ ����ȴ�. ���� �߻��ϰ� ���ϰ�
			System.out.println("finally");
		}
		System.out.println("end");
	}

}
