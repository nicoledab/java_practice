package test.day0330;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class CalEx02 {

	public static void main(String[] args) {
		//Q. calendar 클래스를 활용하여 날짜를 출력하세요!! 
		
		//public abstract class Calendar 캘린더는 추상 클래스여서 직접 생성 못한다
		
		Calendar c1 = new GregorianCalendar(); //다형성으로 생성 
		System.out.println(c1);
	
		//
		Calendar c2 = Calendar.getInstance();
			System.out.println(c2); //이것도 c1이랑 결과 같음 
		
			//
			System.out.println(c1.get(Calendar.YEAR));  //2021
			System.out.println(c1.get(Calendar.DAY_OF_MONTH)); //30
		
          //
			Date day = new Date();
			System.out.println(day.getYear());  // 121 // +1900 붙이기! 
			System.out.println(day.getYear()+1900);  // 2021
			
			//속도로 따지면 캘린더가 더 빠르지만, date를 주로 쓴다
			//
			
			
	}

}
