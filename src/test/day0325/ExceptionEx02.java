package test.day0325;

public class ExceptionEx02 {

	public static void main(String[] args) throws Exception{
		//1. add() �޼��� ȣ��
		//ExceptionEx02.add(); ���� Ŭ���� �� ������ Ŭ������ ��������
		sum();
	}
	
	public static void sum() throws Exception{
		add();
	}
	
	
	
	public static void add() throws Exception {
		throw new Exception();  //���� å���� ����(ȣ���� ��)���� ����
	}
	
	

}
