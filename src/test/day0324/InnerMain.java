package test.day0324;

public class InnerMain {

	public static void main(String[] args) {
		//new �����() {�������̵�}
		
		// �͸�Ŭ������ Runable �������̽��� �����Ѵ�. !! 
		Runable r1 = new Runable() {
			public void name() {
				System.out.println("�͸�Ŭ���� - �������̵�");
			}
		};
		r1.name();
		
		
		// �͸�Ŭ������ Object Ŭ���� ���!!!
		Object obj = new Object() {
			public String toString() {
				return "�͸�Ŭ����"; 
			}
		};
		System.out.println(obj);
	}

}
