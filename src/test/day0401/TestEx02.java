package test.day0401;

import java.util.*;
public class TestEx02 {
	static Scanner s = new Scanner(System.in); //�Է¹޾ƾ��ϴϱ� scanner 
	
	public static void main(String[] args) {
		buyLotto();
	}
	
	public static void buyLotto() {
			System.out.print("���Աݾ� �Է�: ");
			int money = s.nextInt(); 
			int amount = money / 1000; 
			s.nextLine();
			System.out.println("�ζ� ���� �ݾ� : " +money+ "��");
			System.out.println("�ζ� ��ȣ " +amount+"ȸ ���");
			lottoNum(amount);
	}
	
	public static void lottoNum(int amount) {
		
		//����Ʈ ����! 
		
		for(int a=0; a <amount; a++) {  // ���� Ƚ�� ��ŭ �ݺ� 
			
			Set set = new HashSet();  //
			
				for (int i = 0; set.size() < 6; i ++) { // ����� 6�� �ɶ� ���������� 
					int num = (int)(Math.random()*45) + 1; // Math.random(): 0-1
					set.add(new Integer(num));
				}
			ArrayList list = new ArrayList(set);
			Collections.sort(list);
			System.out.println(list);
			}
	
		
		
		/* treeset�� �̿��� ���� 
		for(int a=0; a <amount; a++) {  // ���� Ƚ�� ��ŭ �ݺ� 
			
		TreeSet set = new TreeSet();  //�̰͸� �ϸ� ���ٸ� ����
		
			for (int i = 0; set.size() < 6; i ++) { // ����� 6�� �ɶ� ���������� 
				int num = (int)(Math.random()*45) + 1; // Math.random(): 0-1
				System.out.println("=��ȣ"+i+ "=="+ num);
				set.add(new Integer(num));
			}
		System.out.println(set);
		}
	} //Lottonum �� 
	
	*/
		
		
		
		
	}
}
