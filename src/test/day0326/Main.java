package test.day0326;

public class Main {
	public static void main(String[] args) {
		
		/*
		
		
		//student ��ü ������ .. �ּҸ� s1 ���������� �����Ѵ�. 
		Student s1 = new Student(); 
		Student s2 = new Student(); 
		System.out.println(s1.x); // 100
		System.out.println(s2.x);  // 100
		
		s1.x = 500;
		System.out.println(s1.x); // 500
		System.out.println(s2.x); // 100
		
		s2.x = s1.x; 
		
		Tv t1 = new Tv();
		t1.channel =s1.x; // 500 
		//t1 = s1 Ÿ���� �ٸ��� tv Ÿ�� student Ÿ��

		//----------------------------------
		Student s3 = new Student();
		//Q. channel ����ض�
		System.out.println(s3.t.channel);   //88
		
		*/
		
		
		//Q. api ����Ʈ: integer Ŭ������ �ʵ�(���)�� ��� ����Ͻÿ�
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.TYPE);
		System.out.println(Integer.SIZE);
		
		//Q. MAX��� �޼��带 �̿��� ����� ����غ��� 
		int result = Integer.max(10, 20);
		System.out.println(result); //20
		
		Integer in = new Integer(12);
		Integer in2 = new Integer("55");
		int v = in.intValue();
		int v2 = in2.intValue();
		System.out.println(v);
		System.out.println(v2);
		
		//Q. �޼ҵ带 �����! API ����Ʈ ���� 
         // �⺻��Ű��(java.lang) ������ �ٸ� ��Ű���� Ŭ������ ����ϴ� ���
		// Ŭ������ Ǯ���� ��� / import ��� 
		java.util.Date day = new java.util.Date();
		//���� import java.util �Ἥ �ص� ��
		int year = day.getYear(); 
		System.out.println(year + 1900 + "��");
		
	
		
		
		
	}


}


