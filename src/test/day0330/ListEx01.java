package test.day0330;

import java.util.*;  // *이란? 해당 패키지의 모든 클래스를 import하겠다는 뜻 

public class ListEx01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(100);
		list.add("hello");
		list.add(new Date());
		list.add(1 , 5.7); //지정된 위치에 끼워 넣기. 1 인덱스에 5.7~
		/*
		list.get(0); // 0번째 있는것을 꺼내달라는 뜻
		System.out.println(list.get(0)); // 100
		System.out.println(list.get(1)); // hello
		System.out.println(list.get(2)); //날짜들~ 
		*/
		
		System.out.println(list);
		
		list.set(1, "AAA"); // 1인덱스 값 변경 
		System.out.println(list);
		
		ArrayList list2 = new ArrayList(list);
		System.out.println(list);
		System.out.println(list2);
		
		list.clear();  //list의 내용 모두 삭제 
		System.out.println(list);
		System.out.println(list2);
		
		// list2 에 100이 있으면 true로 나옴
		System.out.println(list2.contains(100));
		System.out.println(list2.indexOf(100)); // 100의 위치는 어디? 
		
		list2.add(100);
		System.out.println(list2);
		System.out.println(list2.indexOf(100)); //0
		System.out.println(list2.lastIndexOf(100)); //4
		
		list2.remove(0); //0번 인댁스("100") 지우기
		System.out.println(list2);
		System.out.println(list2.size());
		
		
		
	}

}
