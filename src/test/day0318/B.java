package test.day0318;

public class B {

	static int x = 10;  //인스턴스 기본형 변수
	int y = 100; 
	
	void add() {
		int x = 200; // 지역변수. 이게 없으면~ x=10; 
		System.out.println(x);
		System.out.println(x);
		//this - 해당 객체의 주소를 갖고있다.
		//this - 지역변수랑 이름 구별할때 쓰는거 
		System.out.println(this.x); // 인스턴스 변수. this 없이 그냥쓰면 지역변수 
		System.out.println(B.x); 
		System.out.println(this.y); 
		
		
	}
	
	
	
	
	
}
