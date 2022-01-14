
public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int i=2;
		
		boolean value=(((num1=num1+10)<10)&&((i=i+2)>10));
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		num1=10;
		i=2;
		boolean value2=(((num1=num1+10)>10)||((i=i+2)>10));
		System.out.println(value2);
		System.out.println(num1);
		System.out.println(i);
		
		int num=(5<3)? 10:20;
		System.out.println(num);
		//간단한 if-else문 조건연산자로 구현 가능
		
		//switch-case문의 case에 문자열 사용 가능하다.
		int month=10;
		int day;
		
		switch(month) {
		case 1: case 3 :case 5: case 7: case 8: case 10: case 12:
			day=31;
			break;
		case 2:
			day=28;
			break;
		case 4: case 6: case 9: case 11:
			day=30;
			break;
		default:
			day=0;
			break;
		
		}
		System.out.println(month+"월은"+day+"일 까지 있습니다.");
	}

}
