package reference;

public class Subject {
	String subjectName;
	int score;
	
	//subject이름을 생성할때 지정하는게 더 합리적이다. 학생마다 과목명은 다 같고 점수가 다르니까 
	public Subject(String name) {
		subjectName=name;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
