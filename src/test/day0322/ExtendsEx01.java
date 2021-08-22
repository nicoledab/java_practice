package test.day0322;

/*
 * object 클래스
 * 최상위 클래스이며 모든 클래스가 상속 받는다.
 * 메서드만 가지고 있다.
 *  - 상속을 받지 않는 클래스에 자동으로 상속된다. 
 */

//super - 조상, 부모
//this - 자신 
// A는 B클래스를 상속 받으세요 = A는 B클래스를 확장 했습니다 = B는 A의 슈퍼클래스입니다. 
// 

class A {   //extends Object을 기본적으로 갖고있음.

}


class B extends A{  
	
}


class C extends A{  // 조상이 같아도 B랑 C는 아무 관계 없다. 
	
	
}

class D extends B{ 
	
}

public class ExtendsEx01 {
 public static void main(String[] args) {
	 B b = new B();
	
 }
 
 
 
}
