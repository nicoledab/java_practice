package test.day0401;

import javax.swing.JOptionPane;

class ThreadEx6 {
	public static void main(String[] args) throws Exception{
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���."); 
		//   �Է�â�� ��� 
		
		
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
		for(int i=10; i > 0; i--) { //���� 
			System.out.println(i);
			try {  //��� ����ó�� �Ǿ��� ��?
				Thread.sleep(1000); // sleep �޼ҵ�: ������ �ð����� �����带 �Ͻ����� ��Ŵ.
			} catch(Exception e ) {}
		}
		
	}
}
