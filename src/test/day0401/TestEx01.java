package test.day0401;

import java.util.*;
public class TestEx01 {

	public static void main(String[] args) {
		/* 
		1.  배열에 중복된 데이터를 제거하고  출력하는 프로그램을 작성하시오. (데이터출력시 순서는 상관없음)
		arr[] = {10, 20, 30, 40, 50, 60, 70, 40, 30, 20} 

	[출력]
	10	true
	20	true
	30	true
	40	true
	50	true
	60	true
	70	true
	40	중복
	30	중복
	20	중복
	  */

	 int arr[] = {10, 20, 30, 40, 50, 60, 70, 40, 30, 20} ;
			 add(arr); 	
	}

	private static void add(int[] arr) {
	
		/* -----------------------------------set을 이용하는 방법
		Set set = new HashSet();
		for( int i : arr) { //int i는 arr만큼 반복한다 
			
			String result = i + "-----" + (  set.add(i) ? "true" : "중복"  ); // 삼한 연산자
			System.out.println(result);	
		}
		
		//add 메소드 뜻: 데이터가 잘 들어갔으면 true. 
		*/
		
		
		//--------------------------------list 이용하는 방법
		List list = new ArrayList();
		for (int i : arr) {
			if(list.contains(i)) {  //리스트에 식이 있으면 true
				System.out.println(i +"  중복");
				
			}else {
				list.add(i);
				System.out.println(i +"  "+true);
			}
		}
		
		
		
	}

}
