package test.day0330;

import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		
		String input = s.nextLine(); //�Է��� ���� �� �ֵ��� ������� �޼��� 
		System.out.println("�Է¹��� �� ="+ input);
		//���: �Է¹��� �� =hello
		
		input = s.nextLine();
		System.out.println("�Է¹��� �� ="+ input);
		
		int input2 = s.nextInt();
		System.out.println("�Է¹��� �� ="+ input2);
		
		
		//-----------
		
		
		
		String str = "100,200,300,400,500";
		Scanner s1 = new Scanner(str);
		s1 = s1.useDelimiter(","); //���ڸ� "," �� �����ؼ� �о���
		System.out.println(s1.next());
		System.out.println(s1.next());
		System.out.println(s1.next());
		System.out.println(s1.next());
		System.out.println(s1.next());
		
		/*
		 ���: 
		    100
			200
			300
			400
			500

		  */
		
		
	}

}






