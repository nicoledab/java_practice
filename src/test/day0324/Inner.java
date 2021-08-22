package test.day0324;

//중첩클래스 /이너클래스
public class Inner {
 

	private class B {
		int value = 20;  // 인스턴스 변수 
		void method() {
			int value = 30; // 지역변수 
			System.out.println(value);       //30
			System.out.println(this.value);  //20
		}
	}
   
}
