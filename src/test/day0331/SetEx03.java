package test.day0331;

//�ζǼ�Ʈ ����� 
import java.util.TreeSet;
public class SetEx03 {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		
		for (int i = 0; set.size() < 6; i ++) { // ����� 6�� �ɶ� ���������� 
			int num = (int)(Math.random()*45) + 1; // Math.random(): 0-1
			System.out.println("=��ȣ"+i+ "=="+ num);
			set.add(new Integer(num));
		}
		
		System.out.println(set);
		
		//[7, 10, 11, 21, 24, 31] ~~����� �����ϰ� �ٸ��� ���� 
		
	}
}
