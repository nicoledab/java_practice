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
		//객체가 6개. 순서가 유지됨 
		
		ArrayList list2 = 
			new ArrayList(list1.subList(1,4));  //subList -  1번째부터 4번재앞까지.. 
		//substring - string의 특정 부분을 복사하겠다는 뜻
		
		print(list1, list2);
		
		
		Collections.sort(list1);	// sort: list1과 list2를 정렬한다.
		Collections.sort(list2);// Collections.sort(List l)
		
		print(list1, list2);
		System.out.println(list1.containsAll(list2));//지정된 요소가 포함되어있는지 확인 
		//list1에 list2의 요소가 모두 다 있으면 true 아니면 false. 
		System.out.println(list1.contains(1)); //true 
		
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		list2.set(3, "AA"); //set은 변경 
		print(list1, list2);

		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다. 겹치지 않은 1,3,5 는 삭제 
		System.out.println(list1.retainAll(list2));	
		print(list1, list2);
		System.out.println(list1.size()); //3  가지고 있는 데이터 수 
		System.out.println(list2.size()); //6
	
		//  list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i= 5; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i); // 0 2 4 삭제 
		}
		print(list1, list2);
	} // main

	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();		
		
	}
}// class
