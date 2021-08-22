package test.day0326;

public class Main {
	public static void main(String[] args) {
		
		/*
		
		
		//student 객체 생성후 .. 주소를 s1 참조변수에 저장한다. 
		Student s1 = new Student(); 
		Student s2 = new Student(); 
		System.out.println(s1.x); // 100
		System.out.println(s2.x);  // 100
		
		s1.x = 500;
		System.out.println(s1.x); // 500
		System.out.println(s2.x); // 100
		
		s2.x = s1.x; 
		
		Tv t1 = new Tv();
		t1.channel =s1.x; // 500 
		//t1 = s1 타입이 다르다 tv 타입 student 타입

		//----------------------------------
		Student s3 = new Student();
		//Q. channel 출력해라
		System.out.println(s3.t.channel);   //88
		
		*/
		
		
		//Q. api 사이트: integer 클래스의 필드(상수)를 모두 출력하시오
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.TYPE);
		System.out.println(Integer.SIZE);
		
		//Q. MAX라는 메서드를 이용해 결과를 출력해보라 
		int result = Integer.max(10, 20);
		System.out.println(result); //20
		
		Integer in = new Integer(12);
		Integer in2 = new Integer("55");
		int v = in.intValue();
		int v2 = in2.intValue();
		System.out.println(v);
		System.out.println(v2);
		
		//Q. 메소드를 만들라! API 사이트 보고 
         // 기본패키지(java.lang) 제외한 다른 패키지의 클래스를 사용하는 경우
		// 클래스의 풀네임 사용 / import 사용 
		java.util.Date day = new java.util.Date();
		//위에 import java.util 써서 해도 됨
		int year = day.getYear(); 
		System.out.println(year + 1900 + "년");
		
	
		
		
		
	}


}


