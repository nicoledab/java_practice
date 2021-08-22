package test.day0323;

public class Super {
	
	public static int a = 100;    //모두
	protected static int b = 100; // 같은 패키지, 다른 패키지의 자손
	 static int c = 100;          //같은 패키지
	private static int d = 100;  // 자기 클래스 
	
	int x;
	int y;
 
		Super(){ //기본 생성자: 매개변수 없는 생성자
			x =100;
			y = 200; 
			//this(100,200); // 자신의 다른 생성자 호출!!
		}
		
		Super(int x, int y){ //생성자 
			this.x = x; 
			this.y = y; 
		}
		
		
		
  void add() {
	 System.out.println("super 조상");
	 
 }
}
