package test.day0325;

public class Main {

	public static void main(String[] args) {
		
		//실행 예외 
		
		try 
		{ //예외 발생 여부 감시 : 예외 발생시, catch() 호출
		int [] a = {10,20,30};
		System.out.println(a[0]);
		System.out.println(a[3]); // 예외발생 
		Main m1 = null;
		System.out.println(m1.toString()); //예외 발생
		//그럴떈 try ~ catch~ 
		}
		
		catch(Exception a){ 
			System.out.println("예외 처리~~!!"+ a.getMessage());
			a.printStackTrace();
		}
		

		

	}

}
