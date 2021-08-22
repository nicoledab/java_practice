package test.day0330;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateEx01 {

	public static void main(String[] args) {

		Date day01 = new Date();
		System.out.println(day01);
			//Tue Mar 30 11:19:28 KST 2021
		
		Date day02 = new Date(2021-1900,2,30); //-1900�� �ؾ� ���������� �����
		System.out.println(day02);
		//Sat Apr 30 00:00:00 KST 3921(���� ��)
		//Tue Mar 30 00:00:00 KST 2021 (���� ��) 
		
		//��¥ ����.
		// 1900�� 1/1 0 0 0 ����
		// 1970�� 1/1 0 0 0 �� �������� �� �ð��� ����
		// ���� �ð��� �� Ȯ���ؾ���! 
		
		
		//get�� �����ϴ°� set�� �������°�
		
		//---- ----------- ---------- -------
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		System.out.println(sdf.format(day01));
		System.out.println(sdf.format(day02));
		//2021�� 03�� 30��
		//2021�� 03�� 30��
		
		
	}

}
