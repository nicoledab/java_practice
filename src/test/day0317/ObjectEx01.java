package test.day0317;

public class ObjectEx01 {

	public static void main(String[] args) {

		Tv t1 = new Tv(); //tv 생성
		
		// 알고있다 / 가지고있다 ( . )
		System.out.println(t1.channel);   // 100
		
	
		t1.channel = 10; //10을 채널에 대입해라~ 라는 뜻
		System.out.println(t1.channel);    // 10
		System.out.println(t1.power);   //false
		System.out.println(t1.volum);    // 0
		
		Tv t2 = new Tv();
		t2.channel = 50; 
		System.out.println(t1.channel); //10
		
		
	}

}
