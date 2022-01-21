package exception;

public class IDFormatTest {
	
	private String userID;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) throws IDFormatException{
		if(userID==null) {
			throw new IDFormatException("아이디는 null일 수 없습니다."); //throw는 에러를 발생시킴 
		}else if(userID.length()<8 || userID.length()>20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요");
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
