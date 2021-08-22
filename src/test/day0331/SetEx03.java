package test.day0331;

//로또세트 만들기 
import java.util.TreeSet;
public class SetEx03 {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		
		for (int i = 0; set.size() < 6; i ++) { // 사이즈가 6이 될때 빠져나간다 
			int num = (int)(Math.random()*45) + 1; // Math.random(): 0-1
			System.out.println("=번호"+i+ "=="+ num);
			set.add(new Integer(num));
		}
		
		System.out.println(set);
		
		//[7, 10, 11, 21, 24, 31] ~~결과가 무한하게 다르게 나옴 
		
	}
}
