package test.day0319;

public class Main02 {

	public static void main(String[] args) {
		// add �޼��带 ȣ���Ͻÿ�!!
		
		add();  //add + 10;������ �ȵ� (void��) 
		Main02.add();
		int x = bbb() + 100;
		System.out.println(x);
		
		Test t = ccc();
		System.out.println(t.x);
	}
	
	static Test ccc() {
		Test t1 = new Test();
		return t1; 
	}
	
	
	static int bbb() {   //���� Ÿ���� �ִ�
		return 10; 
	}
   
	static void add() {    //void = ���� Ÿ���� ����
		System.out.println("Ŭ���� �޼���");
	}
	
}
