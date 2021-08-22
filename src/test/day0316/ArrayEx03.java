package test.day0316;

public class ArrayEx03 {

	public static void main(String[] args) {

		int [] num = new int [3]; 
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		int [] num2 = {10,20,30}; 
		
		for(int a=0; a < num2.length ; a++) {
			System.out.println(num2[a]);
		} //횟수 지정하고 싶을땐
		
		
		
		// 반복 횟수를 지정할수없다
		//배열의 크기만큼 반복한다. 왼쪽에 대입된다
		for(int a : num2) { 
			System.out.print(" "+a);
		}
		
		
		
		
		
	}

}
