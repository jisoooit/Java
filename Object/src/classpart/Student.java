package classpart;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;
	
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
//		studentLee.address="����� ���ʱ� ���ʵ�";
//		studentLee.showStudentInfor();
//	}

}
