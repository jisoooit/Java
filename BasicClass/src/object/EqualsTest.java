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
	
	//�������� �������� ���� equals �޼��带 ������ �Ͽ��ٸ� hashcode�޼��嵵 �������Ͽ� ������ ���� ��ȯ�ǵ��� ��
	
	public int hashCode() {
		//equlas ������ �Ҷ� ���� ������� ������ ���� �ȴ�.
		return studentID;
	}
}

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("test");
		String str2=new String("test");
		
		//���޸� �ּҰ� �ٸ��ϰ� false - ������ ���ϼ�
		System.out.println(str1==str2);
		
		//���ڿ� ��ü�� �����ϳ� - �������� �ƴ϶� �������ϼ� �����Ҷ� equals����.
		System.out.println(str1.equals(str2));
		
		System.out.println("=============================");
		
		Student std1=new Student(10001,"Tomas");
		Student std2=new Student(10001,"Tomas");
		
		System.out.println(std1==std2);
		
		//equals������ ==�̰Ŷ� �Ȱ���. �����Ǹ� �ؾ���.
		System.out.println(std1.equals(std2));
		
		//hashcode�� �̹� �����ǵǾ��ֱ⶧���� ����.string��
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		//������ �ϱ� ������ �ٸ�. equals������ �ϸ� hashcod�� �������ؼ� ���� �������Ѵ�.
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
	}

}
