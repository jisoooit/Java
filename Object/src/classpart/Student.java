package classpart;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student() {}
	//�����ڰ� �ϳ��� ������ default������ �������� �ʴ´�. 
	public Student(int id, String name) {
		studentID=id;
		studentName=name;
	}
	
	public void showStudentInfor() {
		System.out.println(studentName+","+address);
		
	}
	//�Լ��� ���� ���� - �ڵ带 ȿ�������� ���� ���ؼ�, ���������� ���ؼ�, �� �̸��� �´� �ϳ��� ��ɸ�
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName=name;
	}
//	public static void main(String[] args) {
//		Student studentLee=new Student();
//		studentLee.studentName="������";
//		studentLee.studentID=100;
//		studentLee.address="����� ���ʱ� ���ʵ�";
//		studentLee.showStudentInfor();
//	}

}
