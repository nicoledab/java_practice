package test.day0318;

public class Calc {
    
	//오버로딩 - 이름이 같으며 / 매개변수 개수와 타입, 선언순서로 구별한다.
	int sum( int x, int y) {
		int result = x+y;
		return result;
		
		//return x+y; -> 으로도 가능 
	}
	
	
	double sum(double x, double y) {
		return x+y; 
	}
	
	double sum(int x, double y) {
		return x+y; 
	}
	
	
}
