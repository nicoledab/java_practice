package test.day0325;

public class ExceptionEx04 {

	public static void main(String[] args) {
		
		try {
			System.out.println(1);
			System.out.println(0/0); // ���ܹ߻� -> catch�� ��
			System.out.println(2);
		}catch(Exception e) {
			System.out.println(3);
		}finally {
			// ���� �߻� ���ο� ������� �������� ����ȴ�. 
			System.out.println(4);
			
		}
	}

}
