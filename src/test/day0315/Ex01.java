package test.day0315;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//제어문 IF/ switch
		// 비교해서 제어문을 활용할 경우
		// ex) 이름(x), 번호(ㅇ)
		
		int a = 10;
		int b = 20;
		boolean result = a>b;
		if (result)
		{
			a = 100;
			b = 200;
			
		}
		else 
		{
			a = 0; 
			b = 0; 
			
		}
		//명령이 한블럭에 하나면 블럭을 제외할 수 있다. 
		/*
		int x = 100; 
		switch(x)  // 조건식 int, string
		{
				System.out.println("case 100");
			break;
			case 200 :
			case 300 : 
			  // case "hello" :  (x)안됨. 조건식과 같은 타입이어야 함. 
			default : 
				
		}
		
		*/
		
		
		
	}

}
