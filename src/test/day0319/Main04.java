package test.day0319;
//final ��� ...
public class Main04 {
	//�ʱ�ȭ��� 3������ �Ѱ����� �̿��Ҽ� �ִ�. 
	final static int x = 100; 
	final int y; 
	
	{
		y = 300; 
	}
	
	
	
	public static void main(String[] args) {
		
		final int x = 10;   //ó�� �� ����
		final int age = 20; 
		final int AGE = 20;
		
		int y = x;
		int z = y+x; 
		
		// ��� �̸��� ��� �빮�ڷ� �Ѵ�. 
		System.out.println(z);
	}

}
