package reference;

public class Student {
	int studentID;
	String studentName;
	Subject korea;
	Subject math;
//	int koreaScore;
//	int mathScore;
//	int koreaSubject;
//	int mathSubject;
//	int engScore;
//	int engSubject;
	public Student() {
		korea=new Subject("����");
		math=new Subject("����");
	}
	public Student(int id,String name) {
		studentID=id;
		studentName=name;
		
		korea=new Subject("����");
		math=new Subject("����");
	}
	
	public void setKorea(int score) {
		korea.setScore(score);
		
		//�� access�����ϴϱ� �̷��� �ᵵ �ȴ�.
		//korea.subjectName=name;
	}
	
	public void setMath(int score) {
		math.setScore(score);
		
		//�� access�����ϴϱ� �̷��� �ᵵ �ȴ�.
		//korea.subjectName=name;
	}
	
	public void showStudentInfo() {
		int total=korea.getScore()+math.getScore();
		System.out.println(studentName+"�л��� ������ "+total+"�Դϴ�.");
	}
}
