package test.day0319;
//import pro.ex.Hello; //�ٸ� ��Ű���� ������� 

class Pro{
	public static int x = 10;
	private static int y = 10;
	
	private Pro(){  //private�� �ٸ� Ŭ������ ��ü ���� ���Ѵ�
	}
	
	public static void add() {}
	private static void sum() {} 
	
	public int a = 1000; 
	
	//private Pro() {
		
	}
	



public class Main05 {

	public static void main(String[] args) {
		
		//Pro p = new Pro(); // ����. private ������
		
		System.out.println(Pro.x);
		//System.out.println(Pro.y); // ����
		
		//pro.add();
		//pro.sum(); // ����
		
	}

}
