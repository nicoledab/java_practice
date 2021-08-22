package test.day0329;

class Person{
	long id;			// p1.equals(p2)
	public boolean equals(Object obj){  
		boolean result = false; 
		if(obj !=null && obj instanceof Person){
			
			Person p = (Person)obj;
			
			result = id == p.id; //p의 id와 자신의 id를 비교 
		}
			return result;	
	}
	Person(long id){
		this.id=id;
	}
}



public class EqualsEx2 {
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);

		if(p1 == p2){
			System.out.println("p1과 p2는 같은 사람이다.");
		}else{
			System.out.println("p1과 p2는 다른 사람이다.");
		}

		if(p1.equals(p2))
			{
				System.out.println("p1과 p2는 같은 사람이다.");
		}else{
			System.out.println("p1과 p2는 다른 사람이다.");
		}
	}
	
	//system.exit(0); //정상 종료
	//system.exit(100); //강제 종료
	//system.exit(200); // 다시 시작 
}
