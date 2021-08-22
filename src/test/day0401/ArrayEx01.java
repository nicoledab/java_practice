package test.day0401;

import java.util.ArrayList;

public class ArrayEx01 {

	public static void main(String[] args) {
		//---------꺼내는 연습!!!!!
		
		
		ArrayList list = new ArrayList(); 
		//모든 데이터 타입 저장 가능함. 
		// 기본형 /참조형 모두 가능 
		
		list.add(new Integer(100)); 
		list.add("hello");
		
		
		ArrayList list2 = new ArrayList(); 
		list2.add(10);list2.add(20);
		list.add(list2);
		System.out.println(list);  //[100, hello, [10, 20]]
		
		//list 특징 중복값을 허용한다, 순서가 유지된다.
		
		System.out.println(list.size()); // 3 // 사이즈 확인 
		
		if(list.size() > 0) {
			// list.get(0); 이 코드만 쓰면.. 0번째에 뭐가 있는지 모름. 사이즈 부터 확인해야함
		   Object obj = list.get(0); //object로 받기!!!!
		   
		   if(obj instanceof Integer) { //obj 대입된 값이 integer 인지 확인 
		    Integer in = (Integer)obj;  //0번째에는 int가 있으니까 string은 에러남 
		   }
		}
		
		
		//object는 최고 조상!! 
		ArrayList<Object> list3 = new ArrayList<Object>();
		// add() .......
		list.add("hello");
		
		
		
		
		
	}
}
