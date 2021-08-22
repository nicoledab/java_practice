package test.day0317;

public class ObjectEx03 {

	public static void main(String[] args) {

		// 변수 선언 
		Tv t;  // 지역 참조형변수(주소) 선언 (정수 2개-ch/vol/논리형1개-power) 
		       // 모든 참조형변수는 숨겨진 11개의 데이터가 있다 
		//클래스 자체가 타입이 된다!!
		
		 // 지역 기본형변수(값) 선언 (정수만 대입가능) 
		
		//변수는 생성(값 대입) 후 사용한다. 
		t = new Tv(); // t는 주소를 알고 있다.
		 
		Tv t2 = t;  // 같은 주소를 2개의 변수가 가지고 있다 
		
		t.channel = 77; 
		System.out.println(t.channel); // 77
		System.out.println(t2.channel);// 77
		
		t.channel = 88;
		System.out.println(t.channel); // 88
		System.out.println(t2.channel);// 88
		
		Tv t3 = new Tv(200); //호출 
		
		
		
		
		
	}

}
