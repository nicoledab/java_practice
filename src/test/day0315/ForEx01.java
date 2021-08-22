package test.day0315;

public class ForEx01 {
	public static void main(String[] args)
	{
		// 초기식; 조건식; 증감식
		// 초기식 - 변수의 첫 시작값 ( 반복할 첫 시작값 ) 
		// 조건식 (필수) - if문과 동일하며 반복여부를 판단하는 식 
		// 증감식 - 초기식의 변수값을 증감 역할 
		
		// 1 --> 초기식/조건식/내용/증감식
		// 2 -->     /조건식/내용/증감식
		// 3 -->     /조건식/내용/증감식 
		
		for(int x=0; x < 3; x++ )  // 초기식; 조건식; 증감식
		{
			// 반복할 내용 작성
			System.out.println("안녕하세요");
			
		}
		
		int a; 
		for ( a=0 ; a<3; a++)  // 초기식; 조건식(필수); 증감식
		{
			System.out.println("hi");
			
		}
		
		
		
		
		
	}

}
