package test.day0312;

public class SwitchEx01 {

	public static void main(String[] args) {

		int x = 10;  // case로 찾아간다. 
		//만약 x =70;(케이스가 없으면) default로 간다
		
		switch(x + 10 )  //  조건식의 결과는 int 이다. 
		{
		
		case 10 : 
			System.out.println(10);
			break;  
		case 20 : 
			System.out.println(20);
			break;   //케이스 시작하다 브레이크 만나면 여기서 결과 스탑. 
			
		case 30 : 
			System.out.println(30); 
			break;  
		default : 
			System.out.println(100);
		
		}
		
		// 조건문 if 와 switch는 섞어서 쓰지 않는다 
		
		
		
	}

}
