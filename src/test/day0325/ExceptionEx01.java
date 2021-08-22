package test.day0325;

public class ExceptionEx01 {

	public static void main(String[] args) {

		int num = 10;
		for(int a =0; a < 10; a++) {
			int x = (int)(Math.random() * 10);
			// 랜덤으로 수가 나옴         0.9* 10 = 9.34
			
			System.out.println(num / x );
		}
		
		//랜덤으로 수가 0이 나온다면 예외처리한ㄷ ! 
		
		
	}

}
