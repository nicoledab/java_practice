package test.day0331;

import java.util.HashMap;

public class MapEx01 {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap();
		// hm.put("java","abcd");  //������ Integer,Integer
		hm.put(100,"abcd");
		// hm.put(5.7,100); //������  String, String
		hm.put(100,"AAA"); //Ű�� �ߺ��� ������ �ʴ´�."abcd"���� "AAA"�� �������
		
		System.out.println(hm);
		//���:   {java=abcd, 100=abcd, 5.7=abcd}
		
	System.out.println(hm.get(100)); // �ش�Ű(100)�� ���� �ִ°ų���
	System.out.println(hm.get(200)); // 200�̶� Ű�� �����ϱ�: null 
	}

}
