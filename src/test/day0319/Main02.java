package test.day0319;

public class Main02 {

	public static void main(String[] args) {
		// add 메서드를 호출하시오!!
		
		add();  //add + 10;같은건 안됨 (void라서) 
		Main02.add();
		int x = bbb() + 100;
		System.out.println(x);
		
		Test t = ccc();
		System.out.println(t.x);
	}
	
	static Test ccc() {
		Test t1 = new Test();
		return t1; 
	}
	
	
	static int bbb() {   //리턴 타입이 있다
		return 10; 
	}
   
	static void add() {    //void = 리턴 타입이 없다
		System.out.println("클래스 메서드");
	}
	
}
