package test.day0326;

public class Student {
	// Ŭ���� ��� - �ʱ�ȭ ����� Ȱ���Ͽ� �ݵ�� �ʱ�ȭ �ؾ��Ѵ�. 
	// �⺻���� ������� �ʴ´�.
	 public final static int cla = 1; //Ŭ���� ���� 
	 public static Student s = new Student();  
	                         //Ŭ���� ������ ���� 
	 

	 
	 int x = 100; //�ν��Ͻ� �⺻�� ���� 
	 int y = Student.cla; // ������ �ٸ��� static �̶� �ν��Ͻ� 
     // Ŭ���������� �ν��Ͻ� ������ ������ �� ����. 
	// �޼��带 ����ؼ� �����ؾ��Ѵ�. 
	 
	 Tv t = new Tv(); // �ν��Ͻ� ������ ���� 
	 
	 //public static int i = x; �ȵ�
	 public static int i = new Student().x;
	 
	 
	 
}
