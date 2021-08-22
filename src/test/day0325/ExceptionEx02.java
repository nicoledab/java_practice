package test.day0325;

public class ExceptionEx02 {

	public static void main(String[] args) throws Exception{
		//1. add() 메서드 호출
		//ExceptionEx02.add(); 같은 클래스 에 있을떈 클래스명 생략가능
		sum();
	}
	
	public static void sum() throws Exception{
		add();
	}
	
	
	
	public static void add() throws Exception {
		throw new Exception();  //예외 책임을 위쪽(호출한 쪽)으로 돌림
	}
	
	

}
