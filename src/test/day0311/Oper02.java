package test.day0311;

public class Oper02 {

	public static void main(String[] args) {
		
		
		long x = 100000L * 100000; //long x int = 100억 ㅇ 결과가 제대로 나옴. 
		System.out.println(x);
		
		
		// byte -128 ~127 
		byte a = (byte)(100+30);  // ���: -126 �ִ��� 127�̱⿡ ����� ����.. so
		System.out.println(a);
		
		int i = 10; 
		System.out.println(i % 4);  // ��� 2 
		
		
	
		int var1; 
		if(true)	//지역 변수 - 선언된 영역에서만 사용가능한 변수 
		{
			int var2;
			var1 =10;
			var2 =20;
		}
		System.out.println(var1);
		//System.out.println(var2); ���⼭�� var2 ������ ���� ���� ���̶� 
		
		int v1 =15;
		
		char charvalue = '��'; 
		

	}

}
