package test.day0401;

import java.math.BigInteger;
import java.util.Scanner;

public class Practice00 {
	static Scanner s = new Scanner(System.in);	
	
	public static void main(String[] args) {
		
		test03();
	}
	
	
	

	public static void test03() { //���� 3 
		
		//�׳� integer�� long ��� ������ �ʹ� �۾Ƽ� Biginteger ����.
		BigInteger bi = new BigInteger("1"); //"1"- �ʱ�ȭ �� �� 
		for(int i =1; i <=100; i++) {
			bi = bi.multiply(BigInteger.valueOf(i));  
		}
		System.out.println(bi);
		
		/*int sum = 1; 
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);   �ȵ�!!!*/
	
	}
	
	
	private static BigInteger BigInteger(int i) {
		// TODO Auto-generated method stub
		return null;
	}




	public static int test02() {  // ���� 2 
		int result = 0;
		System.out.println("�Է°�:");
		String num = s.nextLine().trim();
		char [] cn = num.toCharArray(); // ���ڿ��� �ѱ��ھ� �����ش�.

		for(char n :cn) {
			result += (n -48);
		}
		System.out.println(result);
		return result;
	}
	
	
	
	public static void test01() {
		System.out.println("�ݺ�Ƚ��:"); //���� 1
		int count = s.nextInt();
		if(count > 0 && count <= 10) {
			for (int i =0; i <count; i++) {
			System.out.println("hello world");
			}
		}
			
	}
		
		
		
		
		
		
		/*		����2
	�� �ڸ����� ���� ���Ͽ� ����ϴ� ���α׷��� �ۼ�
	��) 4567 => 4+5+6+7 => 22�� ����ϴ� ����
		==========��======================
		
		int num= 0;
		int sum= 0;
		*/
		
		
		
		/*		 ����3.
		1~100������ �� �� ���Ͻÿ�.
		1~100������ �� �� ���Ͻÿ�.

		============��=======================
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);*/
		
		/*	����4. 
		 ���� 3������ �ϳ��� Ŭ������ �޼���� ��������� ȣ���ϼ��� */
		

	}


