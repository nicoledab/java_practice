package test.day0319;

class B{ 
	int b = 1000; 
}


class A{
	int a = 500; 
	B b1 = new B();   //�ν��Ͻ� ������ ���� 
	//B b1; �̰Ŵ� B b1 = null; �� ���� 
}


class Test{
	static int x = 200;  //Ŭ���� ����
	static int y = Main.x;
	static A a1 = new A();
}


public class Main {   //���� ���Ͽ� ������ �ϳ��� 
	static int x = 100; // Ŭ���� ����: ��𼭵� ��� ����!!! 
	public static void main(String[] args) {
		
		System.out.println(Main.x);
		System.out.println(x);  // Ŭ������ ��������. 
		
		System.out.println(Test.x);
		System.out.println(Test.a1.a);
		System.out.println(Test.a1.b1.b);
	}
}

