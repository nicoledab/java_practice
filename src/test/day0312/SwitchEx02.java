package test.day0312;

public class SwitchEx02 {

	public static void main(String[] args) {

		
		// 90 �̻� ��� A, 
		//80~89 ���B, 
		//70~ 79 ���C
		// ���� F 
		
		int score = 85;   // double�� ���Ǿ��� ������.
		
		switch (score / 10 ) {   //����� 8.5 �ε� int �����̾ 8�� �ش��       
			case 10 : case 9 :
				System.out.println("A");
				break; 
				
			case 8: 
				System.out.println("B");
				break; 
			case 7: 
				System.out.println("C");
				
				break; 
				
			default:
				System.out.println("F");
				
		}
		
		
		
	}

}
