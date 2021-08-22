package test.day0401;

import java.math.BigInteger;
import java.util.Scanner;

public class Practice00 {
	static Scanner s = new Scanner(System.in);	
	
	public static void main(String[] args) {
		
		test03();
	}
	
	
	

	public static void test03() { //문제 3 
		
		//그냥 integer랑 long 허용 범위가 너무 작아서 Biginteger 쓴다.
		BigInteger bi = new BigInteger("1"); //"1"- 초기화 할 수 
		for(int i =1; i <=100; i++) {
			bi = bi.multiply(BigInteger.valueOf(i));  
		}
		System.out.println(bi);
		
		/*int sum = 1; 
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);   안됨!!!*/
	
	}
	
	
	private static BigInteger BigInteger(int i) {
		// TODO Auto-generated method stub
		return null;
	}




	public static int test02() {  // 문제 2 
		int result = 0;
		System.out.println("입력값:");
		String num = s.nextLine().trim();
		char [] cn = num.toCharArray(); // 문자열을 한글자씩 나워준다.

		for(char n :cn) {
			result += (n -48);
		}
		System.out.println(result);
		return result;
	}
	
	
	
	public static void test01() {
		System.out.println("반복횟수:"); //문제 1
		int count = s.nextInt();
		if(count > 0 && count <= 10) {
			for (int i =0; i <count; i++) {
			System.out.println("hello world");
			}
		}
			
	}
		
		
		
		
		
		
		/*		문제2
	각 자리수의 값을 더하여 출력하는 프로그램을 작성
	예) 4567 => 4+5+6+7 => 22를 출력하는 문제
		==========답======================
		
		int num= 0;
		int sum= 0;
		*/
		
		
		
		/*		 문제3.
		1~100까지의 합 을 구하시오.
		1~100까지의 곱 을 구하시오.

		============답=======================
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);*/
		
		/*	문제4. 
		 위의 3문제를 하나의 클래스에 메서드로 각각만들어 호출하세요 */
		

	}


