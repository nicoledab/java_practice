package test.day0311;

public class Ex04 {

	public static void main(String[] args) {
		
		
		int a =5;
		double b = a; // �Ǽ��� �Ҽ��� ���ڸ��� ǥ���ϴ� double b = (double)a �� �ȴ�. 
		System.out.println(a); //��� 5 
		System.out.println(b); //��� 5.0
		
		
		double x =5.7;  
		int y = (int)x;
		
		System.out.println(x);//sysout + �����̽��� ���� (����Ű�� 
		System.out.println(y);
		
		
		char i = 'a';
		//int j = i;
		double j = i; // 8 = 2 
		System.out.println(i); // a 
		System.out.println(j); //�ƽ�Ű �ڵ� ǥ�� ���� ����� ���� -> 97.0 (double�̴ϱ�.0) 
		
		
		double aa = 65.9;
		char bb = (char)aa;  // char bb = aa �� 2<-8byte�� ���°ſ��� �� 
		System.out.println(aa);
		System.out.println(bb);
		
		aa = bb; // 
		System.out.println(aa);
		System.out.println(bb);
		
		
		//����
		boolean cc = true; // 1byte  
		//int dd = (int)cc; (x) ������ �ٸ� Ÿ�԰� �Բ� �� �� ����. �ܵ����θ� ��� ���� 
		
		
		// byte (1)< short(2) < int(4) <long(8) <float(4) <double(8) 
		
	}

}
