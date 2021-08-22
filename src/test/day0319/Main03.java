package test.day0319;
//초기화 

class Tv{
	int channel = 10;  // 1. 명시적 초기화  
	
	static int volum = 100;  // 명시적 초기화
	
	static{ // 클래스 초기화 블럭 
	  	volum = 200; 
		System.out.println("클래스 블럭");
	}
	//클래스 초기화 블럭은 static{~} 
	
	{
		System.out.println("인스턴스 블럭");
	}
	
	
	Tv(){  // 3. 생성자
		System.out.println("생성자");
		channel = 30;
	}
	
}



public class Main03 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
	}

}
