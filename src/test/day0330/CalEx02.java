package test.day0330;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class CalEx02 {

	public static void main(String[] args) {
		//Q. calendar Ŭ������ Ȱ���Ͽ� ��¥�� ����ϼ���!! 
		
		//public abstract class Calendar Ķ������ �߻� Ŭ�������� ���� ���� ���Ѵ�
		
		Calendar c1 = new GregorianCalendar(); //���������� ���� 
		System.out.println(c1);
	
		//
		Calendar c2 = Calendar.getInstance();
			System.out.println(c2); //�̰͵� c1�̶� ��� ���� 
		
			//
			System.out.println(c1.get(Calendar.YEAR));  //2021
			System.out.println(c1.get(Calendar.DAY_OF_MONTH)); //30
		
          //
			Date day = new Date();
			System.out.println(day.getYear());  // 121 // +1900 ���̱�! 
			System.out.println(day.getYear()+1900);  // 2021
			
			//�ӵ��� ������ Ķ������ �� ��������, date�� �ַ� ����
			//
			
			
	}

}
