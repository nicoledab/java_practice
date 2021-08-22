package test.day0315;

public class ForEx05 {

	public static void main(String[] args) {

		//for문 안에다 while 문은 잘 안씀.(반대도 마찬가지) 주로 같은 종류끼리 쓴다.
		
		//while문 구구단 
		int a =2; 
		while (a <10)
		{ 
			int b = 1;
			while (  b <10  ) {
				System.out.println(a+ " x "+ b +"=" +(a*b));
				b++;
			}
			
			a++;
			
		}
	
		
		
		
		
		
		
		
		
		
	}

}
