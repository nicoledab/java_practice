package test.day0324;

public class Main {
	public static void main(String[] args) {
			/*Animal a1 = new Cat();  // 자손걸로 생성한다
			a1.name1();
			
			Control c1 = new Dog();
			c1.name();
			*/
			
			Runner r1 = new Runner(); 
			Runable r2 = r1; 
			Startable r3 = (Startable)r2;
			
			r1.name();
			System.out.println(r1.speed());
		
			
			r2.name();
			System.out.println(r3.speed());
		
	}
	
}
