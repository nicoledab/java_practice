package test.day0311;

public class Oper03 {

	public static void main(String[] args) {

		
		// 정수,실수,논리 ==> 기본형데이터 타입
	    // String     ==> 참조형 데이터 타입 
		//문자열 ( + ) 사용하여 변수를 연결 할 수 있다. 
		int x = 10; 
		int y= 20; 
		System.out.println("x변수 값 =" + x);
		System.out.println(x + " " + y);
		System.out.println("x+y="+(x+y));
		
		System.out.println(x+ "+" +y+ "=" + (x+y));
		
		
		//스페셜 문자/ 이스케이프 문자 ==> 특수 문자
		System.out.println("\" hello\"");  //" hello"
		System.out.println("\'hello\'"); //'hello' 
		System.out.println("'hello'"); //'hello' 
		System.out.println("\thello\'"); // 	hello' \t = 탭 
		System.out.println("hello \n     world");// \n = 줄바꿈 (리눅스 버전) 
		System.out.println("123456\r    789");// \r = 줄바꿈 (윈도우 버전)
		System.out.println("123456\n\r789");// 두번 줄바꿈 

	}

}
