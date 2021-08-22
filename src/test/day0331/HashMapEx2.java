package test.day0331;


//api 꼭 확인하기 !!1 

import java.util.*;

public class HashMapEx2 {

	public static void main(String[] args) {

		HashMap map = new HashMap();
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("안자바", new Integer(90));
		Set set = map.entrySet(); //entrySet()-map을 set으로 바꿈 
		System.out.println(set);
		//        [안자바=90, 김자바=100, 강자바=80, 이자바=100]
		
		
		Iterator it = set.iterator(); //   반복자

		while(it.hasNext()) {        //next()는 추출하는 역할 
			Map.Entry e = (Map.Entry)it.next(); //set에 있는걸 map으로 바꾸는게 Map.Entry!
			System.out.println("이름 : "+ e.getKey() + ", 점수 : " + e.getValue());
		}
		/*
		이름 : 안자바, 점수 : 90
		이름 : 김자바, 점수 : 100
		이름 : 강자바, 점수 : 80
		이름 : 이자바, 점수 : 100
		*/
		
		
		set = map.keySet(); //key만 리턴 
		System.out.println("참가자 명단 : " + set);
		// 참가자 명단 : [안자바, 김자바, 강자바, 이자바]

		
		Collection values = map.values(); //리턴 타입이 collection이니까 
		it = values.iterator();

		int total = 0;

		while(it.hasNext()) { //map에 들어있는 갯수만큼 반복할 수 있다.
			Integer i = (Integer)it.next();
			total += i.intValue();
		}

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));

	}

}
