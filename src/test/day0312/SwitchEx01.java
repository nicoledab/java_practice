package test.day0312;

public class SwitchEx01 {

	public static void main(String[] args) {

		int x = 10;  // case�� ã�ư���. 
		//���� x =70;(���̽��� ������) default�� ����
		
		switch(x + 10 )  //  ���ǽ��� ����� int �̴�. 
		{
		
		case 10 : 
			System.out.println(10);
			break;  
		case 20 : 
			System.out.println(20);
			break;   //���̽� �����ϴ� �극��ũ ������ ���⼭ ��� ��ž. 
			
		case 30 : 
			System.out.println(30); 
			break;  
		default : 
			System.out.println(100);
		
		}
		
		// ���ǹ� if �� switch�� ��� ���� �ʴ´� 
		
		
		
	}

}
