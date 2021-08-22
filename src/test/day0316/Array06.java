package test.day0316;

public class Array06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열 만드는 방법 
		//1번 
		int [] x = new int[3]; 
		x[0]= 10;
		x[1]= 20;
		x[2]= 30; // x[0]++; 
		
		//2번
		int [] y = {10,20,30};
		
		x[0] = y[2];
		int a = 100;
		y[0] = a; 
		//배열은 변수의 이름이 특이하다.. 라고 이해해도된다 
		
		
		
		System.out.println(x[0]);
		System.out.println(y[0]);
		
	}

}
