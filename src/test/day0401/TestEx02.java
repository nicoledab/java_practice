package test.day0401;

import java.util.*;
public class TestEx02 {
	static Scanner s = new Scanner(System.in); //입력받아야하니까 scanner 
	
	public static void main(String[] args) {
		buyLotto();
	}
	
	public static void buyLotto() {
			System.out.print("구입금액 입력: ");
			int money = s.nextInt(); 
			int amount = money / 1000; 
			s.nextLine();
			System.out.println("로또 구매 금액 : " +money+ "원");
			System.out.println("로또 번호 " +amount+"회 출력");
			lottoNum(amount);
	}
	
	public static void lottoNum(int amount) {
		
		//리스트 정렬! 
		
		for(int a=0; a <amount; a++) {  // 게임 횟수 만큼 반복 
			
			Set set = new HashSet();  //
			
				for (int i = 0; set.size() < 6; i ++) { // 사이즈가 6이 될때 빠져나간다 
					int num = (int)(Math.random()*45) + 1; // Math.random(): 0-1
					set.add(new Integer(num));
				}
			ArrayList list = new ArrayList(set);
			Collections.sort(list);
			System.out.println(list);
			}
	
		
		
		/* treeset을 이용한 정렬 
		for(int a=0; a <amount; a++) {  // 게임 횟수 만큼 반복 
			
		TreeSet set = new TreeSet();  //이것만 하면 한줄만 나옴
		
			for (int i = 0; set.size() < 6; i ++) { // 사이즈가 6이 될때 빠져나간다 
				int num = (int)(Math.random()*45) + 1; // Math.random(): 0-1
				System.out.println("=번호"+i+ "=="+ num);
				set.add(new Integer(num));
			}
		System.out.println(set);
		}
	} //Lottonum 끝 
	
	*/
		
		
		
		
	}
}
