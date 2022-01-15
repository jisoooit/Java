package staticex;

public class Student {
	
	//인스턴스들이 공유하는 변수를 static으로 선언한다!!
	//프로그램이 로드될때 생성된다.
	//private로 선언되면 getter, setter로 접근 가능. 
	private static int serialNum=10000;
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID=serialNum;
	}

	public static int getSerialNum() {
		int i=10; //지역변수 - 메소드 호출될때 생성되서 끝나면 소멸된다.
		System.out.println(i);
		//studentName="홍길동"; 멤버범수, 인스턴스 변수
		//이건 오류난다. new될때 생성되는데 new하지 안하도 이 메소드는 쓸수있으니까 생성되지도 않은 변수 쓸 위험이 있어서 쓸수 없다.
		return serialNum; //static 변수, 클래스변수
	}

	
	
	
}
