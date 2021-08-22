package test.day0319;
//import pro.ex.Hello; //다른 패키지를 갖고오기 

class Pro{
	public static int x = 10;
	private static int y = 10;
	
	private Pro(){  //private은 다른 클래스에 객체 생성 못한다
	}
	
	public static void add() {}
	private static void sum() {} 
	
	public int a = 1000; 
	
	//private Pro() {
		
	}
	



public class Main05 {

	public static void main(String[] args) {
		
		//Pro p = new Pro(); // 오류. private 때문에
		
		System.out.println(Pro.x);
		//System.out.println(Pro.y); // 오류
		
		//pro.add();
		//pro.sum(); // 오류
		
	}

}
