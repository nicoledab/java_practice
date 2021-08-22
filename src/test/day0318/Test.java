package test.day0318;

public class Test { 
	
	//리턴 타입 이름 ()
	//void: 리턴 타입이 없다! 
	void add()
	{
		System.out.println("add 실행 ..!!"); //출력. 리턴타입은 아니다 
	   return;  // void에는 return에 값을 주면 안된다 
	}
	
	//sum 메서드는 두값을 더한 int 값을 리턴한다. 
	int sum() {
		System.out.println("sum 실행 ..!!");
		return 10; //return에 무조건 int를 ...
	}

	void aaa(int x)// int x = 50
	{ 
		System.out.println(x + 100);
		
	}
	
	void bbb (int x, int y) {
		System.out.println(x + y);
		
	}
	
		void ccc(int x, String y) {
		System.out.println(x + y);
	}
	
	int ddd(int x, int y) {
		int result = x+y;
		return result; 
		
		
	}
	
}
