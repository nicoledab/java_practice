package test.day0316;

public class Array06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�迭 ����� ��� 
		//1�� 
		int [] x = new int[3]; 
		x[0]= 10;
		x[1]= 20;
		x[2]= 30; // x[0]++; 
		
		//2��
		int [] y = {10,20,30};
		
		x[0] = y[2];
		int a = 100;
		y[0] = a; 
		//�迭�� ������ �̸��� Ư���ϴ�.. ��� �����ص��ȴ� 
		
		
		
		System.out.println(x[0]);
		System.out.println(y[0]);
		
	}

}
