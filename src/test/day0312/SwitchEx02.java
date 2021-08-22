package test.day0312;

public class SwitchEx02 {

	public static void main(String[] args) {

		
		// 90 이상 출력 A, 
		//80~89 출력B, 
		//70~ 79 출력C
		// 이하 F 
		
		int score = 85;   // double로 조건쓰면 에러남.
		
		switch (score / 10 ) {   //결과는 8.5 인데 int 연산이어서 8로 해당됨       
			case 10 : case 9 :
				System.out.println("A");
				break; 
				
			case 8: 
				System.out.println("B");
				break; 
			case 7: 
				System.out.println("C");
				
				break; 
				
			default:
				System.out.println("F");
				
		}
		
		
		
	}

}
