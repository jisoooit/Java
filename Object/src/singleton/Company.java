package singleton;

public class Company {
	//인스턴스 단 하나만 생성될 수 있게 하자.. 이게 singleton
	//여러개가 만들어지면 안될때 사용한다.
	//유일하게 사용될 instance임.
	private static Company instance=new Company();
	private Company(){
		//외부에서 이 constructor을 호출 할 수 없게 하겠다.
	}
	public static Company getInstance() {
		//가져다 쓰기 위한 메소드
		return instance;
	}
}
