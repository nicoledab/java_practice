package test.day0311;

public class Ex06 {

	public static void main(String[] args) {
		
		//���� ��� ���
		//���α׷��� ���� : ���� / �޼���(�Լ�) 
		//���� ����� �ʱ�ȭ (�޸𸮿� �÷���!! ��� ����) 
		// Ÿ�� �̸� = ��;
		int a = 10; // ����
		int b = 300;// �Ǽ� 
		boolean c = true; //��
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		// ���� (=) ���� 
		int x = a; 
		a = x; 
		
	   //����ȯ = ���� �ٸ� Ÿ�Կ� ����  (int)y; <- �̷��� 
	   // ���� Ÿ����... �ٸ� Ÿ�԰� ������ ���� ����. 
	   // ���� < �Ǽ� 
	   // ���α׷��ֿ��� ũ���۴� ==> "������Ÿ��"���� �����Ѵ�. !
       double y = 5.7; 
       //int z = y; // int = double / int <- double�̹Ƿ� �翬�� ������ ����. 
       int z = (int)y;

       int zz= 10;
       double yy = (double)zz;  // (double) ǥ�ø� ����� �Ѵ�. ����ȯ. 
		
       
       // ������ �����Ҷ� ������ ����� .. �Ҽ����ڸ� ����! 
       
		
       
	}

}
