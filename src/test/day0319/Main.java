package test.day0319;

class B{ 
	int b = 1000; 
}


class A{
	int a = 500; 
	B b1 = new B();   //인스턴스 참조형 변수 
	//B b1; 이거는 B b1 = null; 와 같다 
}


class Test{
	static int x = 200;  //클래스 변수
	static int y = Main.x;
	static A a1 = new A();
}


public class Main {   //같은 파일에 메인은 하나만 
	static int x = 100; // 클래스 변수: 어디서든 사용 가능!!! 
	public static void main(String[] args) {
		
		System.out.println(Main.x);
		System.out.println(x);  // 클래스명 생략가능. 
		
		System.out.println(Test.x);
		System.out.println(Test.a1.a);
		System.out.println(Test.a1.b1.b);
	}
}

