package test.day0331;

//정렬 
import java.util.TreeSet;
public class SetEx02 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(4);
		ts.add(9);
		ts.add(0);
		ts.add(3);
		ts.add(7);
		System.out.println(ts); // 정렬해준다. 
		//[0, 3, 4, 7, 9]
		
		ts.add(5); //추가 
		System.out.println(ts);
		//[0, 3, 4, 5, 7, 9]

	}

}
