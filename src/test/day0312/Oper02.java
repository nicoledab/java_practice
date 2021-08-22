package test.day0312;

public class Oper02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//and 연산
		int x = 10;
		int y = 20;
		
		boolean result = x > 0 && x > y; // t & f = f 
		System.out.println(result);  // 결과:false
		
		result = x > 0 && x > 5 && x > y; //만약 첫번째 조건부터 f면 나머지도 다 false
		System.out.println(result); // false 
		
		
		// or 연산 (||)
		//조건이 하나라도 true면 결과도 true
		
		result = x > 0 || x < y;
		System.out.println(result); // true
		
		result = x > 0 || x > 5 || x > y; 
		System.out.println(result); // true
		// && 랑 ||는 섞어 쓸 수 없다 
		
		
		// "!" 부정
		boolean r = true;
		System.out.println(!r); //false 로 나옴
		
		
		
		
		
		
	}

}
