package test.day0324;

public class InnerMain {

	public static void main(String[] args) {
		//new 조상명() {오버라이딩}
		
		// 익명클래스가 Runable 인터페이스를 구현한다. !! 
		Runable r1 = new Runable() {
			public void name() {
				System.out.println("익명클래스 - 오버라이딩");
			}
		};
		r1.name();
		
		
		// 익명클래스가 Object 클래스 상속!!!
		Object obj = new Object() {
			public String toString() {
				return "익명클래스"; 
			}
		};
		System.out.println(obj);
	}

}
