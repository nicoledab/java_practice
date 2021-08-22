package test.day0331;

import java.util.HashMap;

public class MapEx01 {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap();
		// hm.put("java","abcd");  //에러남 Integer,Integer
		hm.put(100,"abcd");
		// hm.put(5.7,100); //에러남  String, String
		hm.put(100,"AAA"); //키의 중복은 허용되지 않는다."abcd"에서 "AAA"가 덮어씌워짐
		
		System.out.println(hm);
		//결과:   {java=abcd, 100=abcd, 5.7=abcd}
		
	System.out.println(hm.get(100)); // 해당키(100)가 갖고 있는거나옴
	System.out.println(hm.get(200)); // 200이란 키는 없으니까: null 
	}

}
