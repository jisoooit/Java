package singleton;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company c1=Company.getInstance();
		Company c2=Company.getInstance();
		System.out.println(c1);
		System.out.println(c2);
		//동일한 값이죠
		
		//calendar도 싱글톤이다.
		Calendar cal=Calendar.getInstance();
		
	}

}
