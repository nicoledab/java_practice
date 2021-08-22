package test.day0323;

public class ExtendsEx01 {
	public static void main(String[] args) {
		
		Super su = new Sub();
		
		//su객체를 Sub클래스로 대입할 수 있는가? 
		if(su instanceof Sub) {
					Sub s1 = (Sub)su;
					System.out.println("대입 가능");
		} else {
			System.out.println("대입 불가능");
		}

		
		
		
		
		
		/*
		Super su= null;
		Sub s1 = new Sub(); 위아래 대입~ 
		Sub s2 = null;
		
		su =(Super) s1; //super 생략 가능
		su.add();
		//su.sum(); xxxx
		
		s2 =(Sub)su; // 자손 <==조상
		s2.add();
		s2.sum();
		
		s1.x = 0;
		s2.sum();
	*/
		
		
		
		
	}

}
