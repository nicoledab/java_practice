package test.day0323;

public class Super {
	
	public static int a = 100;    //���
	protected static int b = 100; // ���� ��Ű��, �ٸ� ��Ű���� �ڼ�
	 static int c = 100;          //���� ��Ű��
	private static int d = 100;  // �ڱ� Ŭ���� 
	
	int x;
	int y;
 
		Super(){ //�⺻ ������: �Ű����� ���� ������
			x =100;
			y = 200; 
			//this(100,200); // �ڽ��� �ٸ� ������ ȣ��!!
		}
		
		Super(int x, int y){ //������ 
			this.x = x; 
			this.y = y; 
		}
		
		
		
  void add() {
	 System.out.println("super ����");
	 
 }
}
