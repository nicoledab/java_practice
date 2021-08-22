package test.day0311;

public class Ex06 {

	public static void main(String[] args) {
		
		//변수 사용 방법
		//프로그램의 구조 : 변수 / 메서드(함수) 
		//변수 선언과 초기화 (메모리에 올려라!! 라고도 말함) 
		// 타입 이름 = 값;
		int a = 10; // 정수
		int b = 300;// 실수 
		boolean c = true; //논리
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		// 대입 (=) 복사 
		int x = a; 
		a = x; 
		
	   //형변환 = 서로 다른 타입에 대입  (int)y; <- 이런거 
	   // 논리형 타입은... 다른 타입과 대입할 수가 없다. 
	   // 정수 < 실수 
	   // 프로그래밍에서 크다작다 ==> "데이터타입"으로 결정한다. !
       double y = 5.7; 
       //int z = y; // int = double / int <- double이므로 당연히 오류가 난다. 
       int z = (int)y;

       int zz= 10;
       double yy = (double)zz;  // (double) 표시를 해줘야 한다. 형변환. 
		
       
       // 변수를 연산할때 나눗셈 연산시 .. 소수점자리 유의! 
       
		
       
	}

}
