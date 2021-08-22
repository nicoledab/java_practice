package test.day0316;

public class ArrayEx01 {

	public static void main(String[] args) {

		// 타입 [] 이름; 
		// new - 새로운 메모리를 만든다
		//int [] num = new int[3];
		//System.out.println(num);
		// 결과: [I@6a5fc7f7     // 주소 
		
		//double []num = new double[3];
		
		int [] num = new int[3]; 
		num[0] = 100; 
		num[1] = 200; 
		num[2] = 300; 
		
		num[0]++;
		System.out.println(num[0]);
		System.out.println(num[1]+num[2]);
		
		int a = 100;
		System.out.println(num[0] + a);
		
		//결과: 101 500 201
		
		
		
		
	}

}
