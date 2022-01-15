package reference;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student James=new Student(100,"James");
		James.setKorea(100);
		James.setMath(100);
		
		Student Tomas=new Student(101,"Tomas");
		Tomas.setKorea(80);
		Tomas.setMath(60);
		
		James.showStudentInfo();
		Tomas.showStudentInfo();
	}

}
