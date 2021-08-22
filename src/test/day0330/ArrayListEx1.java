package test.day0330;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		//��ü�� 6��. ������ ������ 
		
		ArrayList list2 = 
			new ArrayList(list1.subList(1,4));  //subList -  1��°���� 4����ձ���.. 
		//substring - string�� Ư�� �κ��� �����ϰڴٴ� ��
		
		print(list1, list2);
		
		
		Collections.sort(list1);	// sort: list1�� list2�� �����Ѵ�.
		Collections.sort(list2);// Collections.sort(List l)
		
		print(list1, list2);
		System.out.println(list1.containsAll(list2));//������ ��Ұ� ���ԵǾ��ִ��� Ȯ�� 
		//list1�� list2�� ��Ұ� ��� �� ������ true �ƴϸ� false. 
		System.out.println(list1.contains(1)); //true 
		
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		list2.set(3, "AA"); //set�� ���� 
		print(list1, list2);

		// list1���� list2�� ��ġ�� �κи� ����� �������� �����Ѵ�. ��ġ�� ���� 1,3,5 �� ���� 
		System.out.println(list1.retainAll(list2));	
		print(list1, list2);
		System.out.println(list1.size()); //3  ������ �ִ� ������ �� 
		System.out.println(list2.size()); //6
	
		//  list2���� list1�� ���Ե� ��ü���� �����Ѵ�.
		for(int i= 5; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i); // 0 2 4 ���� 
		}
		print(list1, list2);
	} // main

	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();		
		
	}
}// class
