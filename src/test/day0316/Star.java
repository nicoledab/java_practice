package test.day0316;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for / while / do~ while(최소 1회 실행) 반복문
		
		
		//14. 다이아몬드 별. 줄바꿈이 9번, 별은 최대 9개
		int star = 1; // 별 (처음 기준 공식을 세우자!!!) 
		int space = 4; // 공백 
		boolean status = true; // 별출력 횟수 늘어나는지 여부 판단 
		
		for (int a = 0; a < 9; a++) { //첫번째 수행
			for(int b = 0; b < space; b++) { //space 먼저!!
				System.out.print(" ");
			}
			for(int b = 0; b < star; b++) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈 
			
			if(status) {
				space--;  //이부분에서 별이 3개로 바꿈 (두번째 진행) 
				star +=2; 
			} else {
				space ++;
				star -=2; 
			}
			
			if(space == 0) {  
				status = false;
				
			}
			
		}
			
		
		
		

	}

}
