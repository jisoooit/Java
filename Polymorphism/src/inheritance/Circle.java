package inheritance;

public class Circle {
	//상속은 일반적이고 구체적인 관계일때 사용하는거지 단순히x,y를 갖다쓰고 싶을때는 이렇게 해라
	//이건 상속이 아니고 합성이다. 
	Point point;
	private int radius;
	
	public Circle() {
		point = new Point();
	}
}
