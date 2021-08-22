package test.day0319;

class Sing{ 
	public int x = 100; // 인스턴스 변수
	private static Sing s1 = new Sing(); // 자신의 객체
	private Sing () { }  //생성자
	
	public static Sing getInstance() { //클래스 메서드 
		return s1; 
	}
	
}


public class Main06 {
	public static void main(String[] args) {
		//Q. Sing 클래스의 x를 출력하세요~~~
		//Sing s = new Sing(); 
		Sing s = Sing.getInstance();
		System.out.println(s.x);
		
	}

}
