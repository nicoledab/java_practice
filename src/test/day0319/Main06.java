package test.day0319;

class Sing{ 
	public int x = 100; // �ν��Ͻ� ����
	private static Sing s1 = new Sing(); // �ڽ��� ��ü
	private Sing () { }  //������
	
	public static Sing getInstance() { //Ŭ���� �޼��� 
		return s1; 
	}
	
}


public class Main06 {
	public static void main(String[] args) {
		//Q. Sing Ŭ������ x�� ����ϼ���~~~
		//Sing s = new Sing(); 
		Sing s = Sing.getInstance();
		System.out.println(s.x);
		
	}

}
