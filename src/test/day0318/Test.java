package test.day0318;

public class Test { 
	
	//���� Ÿ�� �̸� ()
	//void: ���� Ÿ���� ����! 
	void add()
	{
		System.out.println("add ���� ..!!"); //���. ����Ÿ���� �ƴϴ� 
	   return;  // void���� return�� ���� �ָ� �ȵȴ� 
	}
	
	//sum �޼���� �ΰ��� ���� int ���� �����Ѵ�. 
	int sum() {
		System.out.println("sum ���� ..!!");
		return 10; //return�� ������ int�� ...
	}

	void aaa(int x)// int x = 50
	{ 
		System.out.println(x + 100);
		
	}
	
	void bbb (int x, int y) {
		System.out.println(x + y);
		
	}
	
		void ccc(int x, String y) {
		System.out.println(x + y);
	}
	
	int ddd(int x, int y) {
		int result = x+y;
		return result; 
		
		
	}
	
}
