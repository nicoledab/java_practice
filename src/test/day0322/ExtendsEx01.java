package test.day0322;

/*
 * object Ŭ����
 * �ֻ��� Ŭ�����̸� ��� Ŭ������ ��� �޴´�.
 * �޼��常 ������ �ִ�.
 *  - ����� ���� �ʴ� Ŭ������ �ڵ����� ��ӵȴ�. 
 */

//super - ����, �θ�
//this - �ڽ� 
// A�� BŬ������ ��� �������� = A�� BŬ������ Ȯ�� �߽��ϴ� = B�� A�� ����Ŭ�����Դϴ�. 
// 

class A {   //extends Object�� �⺻������ ��������.

}


class B extends A{  
	
}


class C extends A{  // ������ ���Ƶ� B�� C�� �ƹ� ���� ����. 
	
	
}

class D extends B{ 
	
}

public class ExtendsEx01 {
 public static void main(String[] args) {
	 B b = new B();
	
 }
 
 
 
}
