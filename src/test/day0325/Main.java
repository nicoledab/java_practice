package test.day0325;

public class Main {

	public static void main(String[] args) {
		
		//���� ���� 
		
		try 
		{ //���� �߻� ���� ���� : ���� �߻���, catch() ȣ��
		int [] a = {10,20,30};
		System.out.println(a[0]);
		System.out.println(a[3]); // ���ܹ߻� 
		Main m1 = null;
		System.out.println(m1.toString()); //���� �߻�
		//�׷��� try ~ catch~ 
		}
		
		catch(Exception a){ 
			System.out.println("���� ó��~~!!"+ a.getMessage());
			a.printStackTrace();
		}
		

		

	}

}
