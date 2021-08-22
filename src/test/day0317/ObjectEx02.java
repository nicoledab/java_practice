package test.day0317;

public class ObjectEx02 {

	public static void main(String[] args) {
        //객체생성 - 생성자까지 동작을 마친것!! 
		Tv t1 = new Tv(); // 참조형 변수임으로 ObjectEx02에서만 쓰인다 
		// new 메모리 생성 및 초기화 
		System.out.println(t1.channel);  // 100 
		
		Car c1 = new Car(); // 
		
		System.out.println(c1.color);   //black
		
		//Car c3 = new Car("red", 200); //2개짜리 생선자에 대입
		//Car c4 = new car(100, "blue"); 에러남; 갯수와 순서를 맞춰야한다.
		//Car c5 = new Car(200); 에러남; 순서와 타입이 똑같아야한다.
	    //Car c6 = new Car("red", 200, 200); 에러남;
		
	}

}
