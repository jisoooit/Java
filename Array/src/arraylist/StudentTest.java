package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student j=new Student(1001,"j");
		j.addSubject("국어", 90);
		j.addSubject("수학", 100);
		j.showStudentInfo();
		
		System.out.println("-------------");
		
		Student t=new Student(1001,"t");
		t.addSubject("국어", 100);
		t.addSubject("수학", 90);
		t.addSubject("영어", 90);
		t.showStudentInfo();
	}

}
