package test.day0317;

public class ObjectEx04 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("red", 200, 2);
		// c1/c2 의 color / speed / door 를 출력하세요~~ 
		
		System.out.println(c1.color+ " "+c1.speed+ " "+c1.door);
		System.out.println(c2.color+ " "+c2.speed+ " "+c2.door);

	}

}
