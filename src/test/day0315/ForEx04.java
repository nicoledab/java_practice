package test.day0315;

public class ForEx04 {

	public static void main(String[] args) {
		
		//1~100 ������ ���� ��� �Ͻÿ�!! 
		
		int sum = 0; 
		for(int a=1; a <= 100; a++) {
			
			//sum = sum + a; 
			sum += a; 
		}
		System.out.println(sum);   //5050
		
		
		
	// 1~ 100 ������ ¦�� �� ����ϼ���!! (2550)
		
		sum=0;   //������ ���� ������ �ٽ� 0����
		for (int a=2; a<= 100; a+=2) {
			sum+=a; 
		}
		System.out.println(sum);   //2550
		
		
	// Ȧ¦ ����!!
	// ������ 2�� ������ �������� Ȯ�� 
		int x =22;
		if (x % 2 == 0)
		{
			System.out.println("¦��");
		} else { 
			System.out.println("Ȧ��");
		}
		
		
	//1~100���� 100�� �ݺ�
	// Ȧ���� ��/ ¦���� �� ���
	// ��°�� ==> ¦�� 2250  Ȧ�� : 2500 
		
		int odd = 0; // Ȧ���� ����
		int even = 0; //¦���� ���� 
		for (int a =1; a <= 100; a++)
		{
			if (a % 2 ==0) 
				even += a; 
			else
				odd += a; 
		}
		System.out.println("¦�� :"+even + " Ȧ�� :"+ odd);
		
		
		
		
		
		
		
		
		
	}

}
