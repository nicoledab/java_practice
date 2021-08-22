package test.day0329;

//API 

class A {
	public String toString() {
		return "A class"; 
	}
}

public class ObjectEx01 {
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a); // toString() 생략
		System.out.println(a.toString()); //결과가 위와 같음 
		
		//-------------
		
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1 == s2);   //true
		System.out.println(s1.hashCode()); //99162322
		System.out.println(s2.hashCode()); //99162322
		
		//-------------
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s3 == s4);	//false // 서로 다른 주소기 때문에 ..	
		//                  주소 비교하는거라 false가 나옴 
		
		System.out.println(s3.equals(s4)); //true // 참조형 비교 
		 // 같은 문자열을 같고 있다. 
		
		
		
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("hello");
		System.out.println(sb1 == sb2); //false
		System.out.println(sb1.equals(sb2)); // false  //둘다 여전히 주소비교 
		//api에서 - equals(), - tostring () 오버라이딩 여부 확인
		//stringbuffer는 여러 객체를 생성해서 사용하는걸 권하지 않는다. 
		
	}

}

//상속 / 필드 (상수) // 생성자 / 메서드
//- equals(), - tostring () 오버라이딩 여부 확인
