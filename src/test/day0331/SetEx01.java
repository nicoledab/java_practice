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
		//��� ������ �ٸ� �� �ִ�. 
		
		System.out.println(hs); //  �ߺ����� ���� �ʴ´�
	}

	

}
