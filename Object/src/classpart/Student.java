package classpart;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfor() {
		System.out.println(studentName+","+address);
		
	}
	//함수를 쓰는 이유 - 코드를 효율적으로 쓰기 위해서, 유지보수를 위해서, 그 이름에 맞는 하나의 기능만
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName=name;
	}
//	public static void main(String[] args) {
//		Student studentLee=new Student();
//		studentLee.studentName="권지수";
//		studentLee.address="서울시 서초구 서초동";
//		studentLee.showStudentInfor();
//	}

}
