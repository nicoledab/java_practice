package test.day0315;

public class ForEx04 {

	public static void main(String[] args) {
		
		//1~100 까지의 합을 출력 하시오!! 
		
		int sum = 0; 
		for(int a=1; a <= 100; a++) {
			
			//sum = sum + a; 
			sum += a; 
		}
		System.out.println(sum);   //5050
		
		
		
	// 1~ 100 까지의 짝수 합 출력하세요!! (2550)
		
		sum=0;   //위에서 선언 했으니 다시 0으로
		for (int a=2; a<= 100; a+=2) {
			sum+=a; 
		}
		System.out.println(sum);   //2550
		
		
	// 홀짝 구분!!
	// 나눗셈 2로 나누어 나머지값 확인 
		int x =22;
		if (x % 2 == 0)
		{
			System.out.println("짝수");
		} else { 
			System.out.println("홀수");
		}
		
		
	//1~100까지 100번 반복
	// 홀수의 합/ 짝수의 합 출력
	// 출력결과 ==> 짝수 2250  홀수 : 2500 
		
		int odd = 0; // 홀수합 저장
		int even = 0; //짝수합 저장 
		for (int a =1; a <= 100; a++)
		{
			if (a % 2 ==0) 
				even += a; 
			else
				odd += a; 
		}
		System.out.println("짝수 :"+even + " 홀수 :"+ odd);
		
		
		
		
		
		
		
		
		
	}

}
