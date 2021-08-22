package test.day0330;

public class IntegerEx01 {

	public static void main(String[] args) {

		String str = "200";
		int num = 100;
		
		int num2 = Integer.parseInt(str); //문자 200을 숫자 200으로 바꿔줌
		// 다만 숫자 형식의 문자열을 넣어야만 
		
		System.out.println(num+num2); // 300
	}

}
