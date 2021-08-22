package test.day0325;

public class ExceptionEx04 {

	public static void main(String[] args) {
		
		try {
			System.out.println(1);
			System.out.println(0/0); // 예외발생 -> catch로 감
			System.out.println(2);
		}catch(Exception e) {
			System.out.println(3);
		}finally {
			// 예외 발생 여부와 관계없이 마지막에 실행된다. 
			System.out.println(4);
			
		}
	}

}
