package test.day0331;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

class Tv{
	
}

public class SetEx01 {
	public static void main(String[] args) {

		HashSet hs = new HashSet();
		Set hs2 = new HashSet(); 
		
		hs.add(100);
		hs.add(100);
		
		hs.add(new Date());
		hs.add(new Date());
		hs.add(new Tv());
		hs.add(new Tv());
		hs.add("hello");
		hs.add("hello");
		hs.add(new String("AAA"));
		hs.add(new String("AAA"));
		//결과 순서는 다를 수 있다. 
		
		System.out.println(hs); //  중복값이 들어가지 않는다
	}

	

}
