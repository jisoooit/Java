package object;

class Student{
	int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {

		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std=(Student)obj;
			if(this.studentID==std.studentID) return true;
			else return false;
		}	
		return false;
	}
	
	//논리적으로 동일함을 위해 equals 메서드를 재정의 하였다면 hashcode메서드도 재정의하여 동일한 값이 반환되도록 함
	
	public int hashCode() {
		//equlas 재정의 할때 쓰인 멤버변수 가져다 쓰면 된다.
		return studentID;
	}
}

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("test");
		String str2=new String("test");
		
		//힙메모리 주소가 다르니가 false - 물리적 동일성
		System.out.println(str1==str2);
		
		//문자열 자체가 동일하냐 - 물리적이 아니라 논리적동일성 정의할때 equals쓴다.
		System.out.println(str1.equals(str2));
		
		System.out.println("=============================");
		
		Student std1=new Student(10001,"Tomas");
		Student std2=new Student(10001,"Tomas");
		
		System.out.println(std1==std2);
		
		//equals원형은 ==이거랑 똑같음. 재정의를 해야함.
		System.out.println(std1.equals(std2));
		
		//hashcode가 이미 재정의되어있기때문에 같다.string은
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		//재정의 하기 전에는 다름. equals재정의 하면 hashcod도 재정의해서 같게 만들어야한다.
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
	}

}
