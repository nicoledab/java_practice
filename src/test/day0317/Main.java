package test.day0317;

public class Main {

	public static void main(String[] args) {

		//객체 만드는 방법 
		// 선언 => 클래스명 변수명;
		// 생성 => 변수명 = new 클래스명 ();
		// 클래스, 배열 = 참조형 데이터ㅏ입
		Tv t; 
		t = new Tv();  //new가 메모리- 즉 제품을 만들어 주는 역할. tv 생산했음! 
		//같은 패키지 안에 Tv를 만들어놓아서 가능한.. 
		//변수와 메소드 수 만큼 메모리가 구성된다. 
		Car c = new Car(); // car 생산!
		Test t1 = new Test();
		Main m = new Main(); 
		int [] a = new int[3];
		
		//같은 설계도를 가지고 .. Tv를 3대 생산했다.. 
		// tv1, tv2, tv3 참조변수 
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		Tv tv3 = new Tv();
		System.out.println(tv1);
		System.out.println(tv2);
		System.out.println(tv3);
		
		String s = new String();
		
		
	}

}
