package test.day0330;

import java.util.ArrayList;

public class ListEx03 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("hello");
		list.add(100);
		list.add(5.7);
		list.add("hello");
		list.add("world");
		list.add(true);
		System.out.println(list);
		
		
		// Q. 타입이 지정안된 리스트에서 String 만 출력해보자!
		//각 타입을 반복해서 타입을 비교한다.
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			if(obj instanceof String) { //객체 타입을 확인시켜줌
				String s = (String) obj;
				System.out.println("위치-"+i+" 값-"+s);
			}
		} //for 끝

 }
}
