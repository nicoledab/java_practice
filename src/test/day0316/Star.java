package test.day0316;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for / while / do~ while(�ּ� 1ȸ ����) �ݺ���
		
		
		//14. ���̾Ƹ�� ��. �ٹٲ��� 9��, ���� �ִ� 9��
		int star = 1; // �� (ó�� ���� ������ ������!!!) 
		int space = 4; // ���� 
		boolean status = true; // ����� Ƚ�� �þ���� ���� �Ǵ� 
		
		for (int a = 0; a < 9; a++) { //ù��° ����
			for(int b = 0; b < space; b++) { //space ����!!
				System.out.print(" ");
			}
			for(int b = 0; b < star; b++) {
				System.out.print("*");
			}
			System.out.println(); // �ٹٲ� 
			
			if(status) {
				space--;  //�̺κп��� ���� 3���� �ٲ� (�ι�° ����) 
				star +=2; 
			} else {
				space ++;
				star -=2; 
			}
			
			if(space == 0) {  
				status = false;
				
			}
			
		}
			
		
		
		

	}

}
