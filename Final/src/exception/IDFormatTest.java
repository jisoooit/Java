package exception;

public class IDFormatTest {
	
	private String userID;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) throws IDFormatException{
		if(userID==null) {
			throw new IDFormatException("���̵�� null�� �� �����ϴ�."); //throw�� ������ �߻���Ŵ 
		}else if(userID.length()<8 || userID.length()>20) {
			throw new IDFormatException("���̵�� 8�� �̻� 20�� ���Ϸ� ������");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDFormatTest idtest=new IDFormatTest();
		String userID=null;
		try {
			idtest.setUserID(userID);
		} catch (IDFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		userID="1234567";
		try {
			idtest.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
