package test.day0331;


//api �� Ȯ���ϱ� !!1 

import java.util.*;

public class HashMapEx2 {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(80));
		map.put("���ڹ�", new Integer(90));
		Set set = map.entrySet(); //entrySet()-map�� set���� �ٲ� 
		System.out.println(set);
		//        [���ڹ�=90, ���ڹ�=100, ���ڹ�=80, ���ڹ�=100]
		
		
		Iterator it = set.iterator(); //   �ݺ���

		while(it.hasNext()) {        //next()�� �����ϴ� ���� 
			Map.Entry e = (Map.Entry)it.next(); //set�� �ִ°� map���� �ٲٴ°� Map.Entry!
			System.out.println("�̸� : "+ e.getKey() + ", ���� : " + e.getValue());
		}
		/*
		�̸� : ���ڹ�, ���� : 90
		�̸� : ���ڹ�, ���� : 100
		�̸� : ���ڹ�, ���� : 80
		�̸� : ���ڹ�, ���� : 100
		*/
		
		
		set = map.keySet(); //key�� ���� 
		System.out.println("������ ��� : " + set);
		// ������ ��� : [���ڹ�, ���ڹ�, ���ڹ�, ���ڹ�]

		
		Collection values = map.values(); //���� Ÿ���� collection�̴ϱ� 
		it = values.iterator();

		int total = 0;

		while(it.hasNext()) { //map�� ����ִ� ������ŭ �ݺ��� �� �ִ�.
			Integer i = (Integer)it.next();
			total += i.intValue();
		}

		System.out.println("���� : " + total);
		System.out.println("��� : " + (float)total/set.size());
		System.out.println("�ְ����� : " + Collections.max(values));
		System.out.println("�������� : " + Collections.min(values));

	}

}
