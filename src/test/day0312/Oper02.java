package test.day0312;

public class Oper02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//and ����
		int x = 10;
		int y = 20;
		
		boolean result = x > 0 && x > y; // t & f = f 
		System.out.println(result);  // ���:false
		
		result = x > 0 && x > 5 && x > y; //���� ù��° ���Ǻ��� f�� �������� �� false
		System.out.println(result); // false 
		
		
		// or ���� (||)
		//������ �ϳ��� true�� ����� true
		
		result = x > 0 || x < y;
		System.out.println(result); // true
		
		result = x > 0 || x > 5 || x > y; 
		System.out.println(result); // true
		// && �� ||�� ���� �� �� ���� 
		
		
		// "!" ����
		boolean r = true;
		System.out.println(!r); //false �� ����
		
		
		
		
		
		
	}

}
