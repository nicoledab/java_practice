package test.day0324;

//��øŬ���� /�̳�Ŭ����
public class Inner {
 

	private class B {
		int value = 20;  // �ν��Ͻ� ���� 
		void method() {
			int value = 30; // �������� 
			System.out.println(value);       //30
			System.out.println(this.value);  //20
		}
	}
   
}
