package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student j=new Student(1001,"j");
		j.addSubject("����", 90);
		j.addSubject("����", 100);
		j.showStudentInfo();
		
		System.out.println("-------------");
		
		Student t=new Student(1001,"t");
		t.addSubject("����", 100);
		t.addSubject("����", 90);
		t.addSubject("����", 90);
		t.showStudentInfo();
	}

}
