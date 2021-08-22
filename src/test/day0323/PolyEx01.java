package test.day0323;

public class PolyEx01 {

	public static void main(String[] args) {

		
		int [] a = new int[3]; //기본형 배열 
		Super [] s = new Super[3]; //참조형 배열
		/*참조형의 기본값은 ? null 
		 * 
		 * 즉 Super [] s = new Super[3];은 
		Super s1 = null;
		Super s1 = null;
		Super s1 = null;
		이거랑 같은거임. 객체를 생성한게 아니라 배열만 생성한 상태
		*/
		s[0] = new Super();
		s[1] = new Super();
		s[2] = new Super();
		System.out.println(s);
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		Super s0 = new Super();
		System.out.println(s0.x );
		System.out.println(s[0].x );
		
		
	
		
		
		
	}

}
