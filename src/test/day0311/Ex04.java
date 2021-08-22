package test.day0311;

public class Ex04 {

	public static void main(String[] args) {
		
		
		int a =5;
		double b = a; // 실수는 소숫점 한자리를 표현하다 double b = (double)a 도 된다. 
		System.out.println(a); //결과 5 
		System.out.println(b); //결과 5.0
		
		
		double x =5.7;  
		int y = (int)x;
		
		System.out.println(x);//sysout + 스페이스바 쓰기 (단축키임 
		System.out.println(y);
		
		
		char i = 'a';
		//int j = i;
		double j = i; // 8 = 2 
		System.out.println(i); // a 
		System.out.println(j); //아스키 코드 표에 따라서 결과가 나옴 -> 97.0 (double이니까.0) 
		
		
		double aa = 65.9;
		char bb = (char)aa;  // char bb = aa 는 2<-8byte에 들어가는거여서 ㅌ 
		System.out.println(aa);
		System.out.println(bb);
		
		aa = bb; // 
		System.out.println(aa);
		System.out.println(bb);
		
		
		//논리형
		boolean cc = true; // 1byte  
		//int dd = (int)cc; (x) 논리형은 다른 타입과 함께 쓸 수 없다. 단독으로만 사용 가능 
		
		
		// byte (1)< short(2) < int(4) <long(8) <float(4) <double(8) 
		
	}

}
