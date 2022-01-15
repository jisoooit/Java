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
		korea=new Subject("국어");
		math=new Subject("수학");
	}
	public Student(int id,String name) {
		studentID=id;
		studentName=name;
		
		korea=new Subject("국어");
		math=new Subject("수학");
	}
	
	public void setKorea(int score) {
		korea.setScore(score);
		
		//다 access가능하니까 이렇게 써도 된다.
		//korea.subjectName=name;
	}
	
	public void setMath(int score) {
		math.setScore(score);
		
		//다 access가능하니까 이렇게 써도 된다.
		//korea.subjectName=name;
	}
	
	public void showStudentInfo() {
		int total=korea.getScore()+math.getScore();
		System.out.println(studentName+"학생의 총점은 "+total+"입니다.");
	}
}
