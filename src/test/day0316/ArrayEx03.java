package test.day0316;

public class ArrayEx03 {

	public static void main(String[] args) {

		int [] num = new int [3]; 
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		int [] num2 = {10,20,30}; 
		
		for(int a=0; a < num2.length ; a++) {
			System.out.println(num2[a]);
		} //Ƚ�� �����ϰ� ������
		
		
		
		// �ݺ� Ƚ���� �����Ҽ�����
		//�迭�� ũ�⸸ŭ �ݺ��Ѵ�. ���ʿ� ���Եȴ�
		for(int a : num2) { 
			System.out.print(" "+a);
		}
		
		
		
		
		
	}

}
