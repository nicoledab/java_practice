package test.day0318;

public class B {

	static int x = 10;  //�ν��Ͻ� �⺻�� ����
	int y = 100; 
	
	void add() {
		int x = 200; // ��������. �̰� ������~ x=10; 
		System.out.println(x);
		System.out.println(x);
		//this - �ش� ��ü�� �ּҸ� �����ִ�.
		//this - ���������� �̸� �����Ҷ� ���°� 
		System.out.println(this.x); // �ν��Ͻ� ����. this ���� �׳ɾ��� �������� 
		System.out.println(B.x); 
		System.out.println(this.y); 
		
		
	}
	
	
	
	
	
}
