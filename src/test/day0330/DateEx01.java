package test.day0330;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateEx01 {

	public static void main(String[] args) {

		Date day01 = new Date();
		System.out.println(day01);
			//Tue Mar 30 11:19:28 KST 2021
		
		Date day02 = new Date(2021-1900,2,30); //-1900을 해야 정상적으로 실행됨
		System.out.println(day02);
		//Sat Apr 30 00:00:00 KST 3921(수정 전)
		//Tue Mar 30 00:00:00 KST 2021 (수정 후) 
		
		//날짜 기준.
		// 1900년 1/1 0 0 0 기준
		// 1970년 1/1 0 0 0 을 기준으로 한 시간도 있음
		// 기준 시간을 꼭 확인해야함! 
		
		
		//get은 저장하는거 set은 꺼내쓰는거
		
		//---- ----------- ---------- -------
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(day01));
		System.out.println(sdf.format(day02));
		//2021년 03월 30일
		//2021년 03월 30일
		
		
	}

}
