package test.day0330;

import java.util.*;  // *�̶�? �ش� ��Ű���� ��� Ŭ������ import�ϰڴٴ� �� 

public class ListEx01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(100);
		list.add("hello");
		list.add(new Date());
		list.add(1 , 5.7); //������ ��ġ�� ���� �ֱ�. 1 �ε����� 5.7~
		/*
		list.get(0); // 0��° �ִ°��� �����޶�� ��
		System.out.println(list.get(0)); // 100
		System.out.println(list.get(1)); // hello
		System.out.println(list.get(2)); //��¥��~ 
		*/
		
		System.out.println(list);
		
		list.set(1, "AAA"); // 1�ε��� �� ���� 
		System.out.println(list);
		
		ArrayList list2 = new ArrayList(list);
		System.out.println(list);
		System.out.println(list2);
		
		list.clear();  //list�� ���� ��� ���� 
		System.out.println(list);
		System.out.println(list2);
		
		// list2 �� 100�� ������ true�� ����
		System.out.println(list2.contains(100));
		System.out.println(list2.indexOf(100)); // 100�� ��ġ�� ���? 
		
		list2.add(100);
		System.out.println(list2);
		System.out.println(list2.indexOf(100)); //0
		System.out.println(list2.lastIndexOf(100)); //4
		
		list2.remove(0); //0�� �δ콺("100") �����
		System.out.println(list2);
		System.out.println(list2.size());
		
		
		
	}

}