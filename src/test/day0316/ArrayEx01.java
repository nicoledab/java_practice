package test.day0316;

public class ArrayEx01 {

	public static void main(String[] args) {

		// Ÿ�� [] �̸�; 
		// new - ���ο� �޸𸮸� �����
		//int [] num = new int[3];
		//System.out.println(num);
		// ���: [I@6a5fc7f7     // �ּ� 
		
		//double []num = new double[3];
		
		int [] num = new int[3]; 
		num[0] = 100; 
		num[1] = 200; 
		num[2] = 300; 
		
		num[0]++;
		System.out.println(num[0]);
		System.out.println(num[1]+num[2]);
		
		int a = 100;
		System.out.println(num[0] + a);
		
		//���: 101 500 201
		
		
		
		
	}

}
