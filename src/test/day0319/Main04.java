package test.day0319;
//final 상수 ...
public class Main04 {
	//초기화방법 3가지중 한가지만 이용할수 있다. 
	final static int x = 100; 
	final int y; 
	
	{
		y = 300; 
	}
	
	
	
	public static void main(String[] args) {
		
		final int x = 10;   //처음 값 대입
		final int age = 20; 
		final int AGE = 20;
		
		int y = x;
		int z = y+x; 
		
		// 상수 이름은 모두 대문자로 한다. 
		System.out.println(z);
	}

}
