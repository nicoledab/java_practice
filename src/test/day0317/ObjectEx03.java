package test.day0317;

public class ObjectEx03 {

	public static void main(String[] args) {

		// ���� ���� 
		Tv t;  // ���� ����������(�ּ�) ���� (���� 2��-ch/vol/����1��-power) 
		       // ��� ������������ ������ 11���� �����Ͱ� �ִ� 
		//Ŭ���� ��ü�� Ÿ���� �ȴ�!!
		
		 // ���� �⺻������(��) ���� (������ ���԰���) 
		
		//������ ����(�� ����) �� ����Ѵ�. 
		t = new Tv(); // t�� �ּҸ� �˰� �ִ�.
		 
		Tv t2 = t;  // ���� �ּҸ� 2���� ������ ������ �ִ� 
		
		t.channel = 77; 
		System.out.println(t.channel); // 77
		System.out.println(t2.channel);// 77
		
		t.channel = 88;
		System.out.println(t.channel); // 88
		System.out.println(t2.channel);// 88
		
		Tv t3 = new Tv(200); //ȣ�� 
		
		
		
		
		
	}

}
