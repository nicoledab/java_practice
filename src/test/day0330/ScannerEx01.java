package test.day0330;

import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		
		String input = s.nextLine(); //입력을 받을 수 있도록 만들어진 메서드 
		System.out.println("입력받은 값 ="+ input);
		//결과: 입력받은 값 =hello
		
		input = s.nextLine();
		System.out.println("입력받은 값 ="+ input);
		
		int input2 = s.nextInt();
		System.out.println("입력받은 값 ="+ input2);
		
		
		//-----------
		
		
		
		String str = "100,200,300,400,500";
		Scanner s1 = new Scanner(str);
		s1 = s1.useDelimiter(","); //문자를 "," 로 구분해서 읽어줌
		System.out.println(s1.next());
		System.out.println(s1.next());
		System.out.println(s1.next());
		System.out.println(s1.next());
		System.out.println(s1.next());
		
		/*
		 결과: 
		    100
			200
			300
			400
			500

		  */
		
		
	}

}






