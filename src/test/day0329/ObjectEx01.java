package test.day0329;

//API 

class A {
	public String toString() {
		return "A class"; 
	}
}

public class ObjectEx01 {
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a); // toString() ����
		System.out.println(a.toString()); //����� ���� ���� 
		
		//-------------
		
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1 == s2);   //true
		System.out.println(s1.hashCode()); //99162322
		System.out.println(s2.hashCode()); //99162322
		
		//-------------
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s3 == s4);	//false // ���� �ٸ� �ּұ� ������ ..	
		//                  �ּ� ���ϴ°Ŷ� false�� ���� 
		
		System.out.println(s3.equals(s4)); //true // ������ �� 
		 // ���� ���ڿ��� ���� �ִ�. 
		
		
		
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("hello");
		System.out.println(sb1 == sb2); //false
		System.out.println(sb1.equals(sb2)); // false  //�Ѵ� ������ �ּҺ� 
		//api���� - equals(), - tostring () �������̵� ���� Ȯ��
		//stringbuffer�� ���� ��ü�� �����ؼ� ����ϴ°� ������ �ʴ´�. 
		
	}

}

//��� / �ʵ� (���) // ������ / �޼���
//- equals(), - tostring () �������̵� ���� Ȯ��
