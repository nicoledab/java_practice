package test.day0311;

public class Oper03 {

	public static void main(String[] args) {

		
		// ����,�Ǽ�,�� ==> �⺻�������� Ÿ��
	    // String     ==> ������ ������ Ÿ�� 
		//���ڿ� ( + ) ����Ͽ� ������ ���� �� �� �ִ�. 
		int x = 10; 
		int y= 20; 
		System.out.println("x���� �� =" + x);
		System.out.println(x + " " + y);
		System.out.println("x+y="+(x+y));
		
		System.out.println(x+ "+" +y+ "=" + (x+y));
		
		
		//����� ����/ �̽������� ���� ==> Ư�� ����
		System.out.println("\" hello\"");  //" hello"
		System.out.println("\'hello\'"); //'hello' 
		System.out.println("'hello'"); //'hello' 
		System.out.println("\thello\'"); // 	hello' \t = �� 
		System.out.println("hello \n     world");// \n = �ٹٲ� (������ ����) 
		System.out.println("123456\r    789");// \r = �ٹٲ� (������ ����)
		System.out.println("123456\n\r789");// �ι� �ٹٲ� 

	}

}
