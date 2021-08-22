package test.day0324;

public class Dog implements Control{  
	//extends와 다르게 implement control, ~,
	
	
	//상속(extends) - 하나의 클래스만 상속받을 수 있다.
	// 구현(implement): 여러개 인터페이스 구현 가능 implement control, ~, ~
	
	
	public void name() { //오버라이딩
		System.out.println("개");
	}
	

	public void sound() {   //오버라이딩
		System.out.println("으르렁 ");
		
	}
}
