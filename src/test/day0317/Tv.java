package test.day0317;

// Tv 설계도 제작 
// - 전원 / 채널 / 소리  
public class Tv {
	boolean power = false; // 전원 (기본적으로 꺼져있음) 
	int channel = 1; 
	int volum = 0; 
	
	
	//모든 클래스는 최소 1개이상 생성자를 가진다 
	//생선자가 하나도 없으면 컴파일러가 자동을 ㅗ내용이 비어있는 기본생선자를 추가한다.
	// 기본생성자란? - 매개변수가 없는 생성자 
	//생성자는 - 매개변수 갯수와 타입, 순서를 구별한다, 이름으론 구별x 
	
	// 매개변수 - 생성자(소괄호) 에서 선언만된 변수 Tv(double d){ ~
	// 매개변수도 지역변수 이다 
	// 사용하는측(호출)에서 값을 넣어준다. 
	Tv(){  
	}
	
	Tv(int c){
		channel = c; 
	}
	
	
	
	
	Tv(int a, int b){
		channel = b; 
	}
	Tv(double a, int b){
		channel = b; 
	}
	Tv(int a, double b){
		channel = a; 
	}
	
	Tv(int a, long b){
	}
	
	
}
