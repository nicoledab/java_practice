package test.day0316;

public class Star02 {

	public static void main(String[] args) {

		int star = 5; // �� (ó�� ���� ������ ������!!!) 
		int space = 0; // ���� 
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
				space++;  //�̺κп��� ���� 3���� �ٲ� (�ι�° ����) 
				star --; 
			} else {
				space --;
				star ++; 
			}
			
			if(space == 4) {  
				status = false;
				
			}
			
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
