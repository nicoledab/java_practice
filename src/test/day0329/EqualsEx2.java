package test.day0329;

class Person{
	long id;			// p1.equals(p2)
	public boolean equals(Object obj){  
		boolean result = false; 
		if(obj !=null && obj instanceof Person){
			
			Person p = (Person)obj;
			
			result = id == p.id; //p�� id�� �ڽ��� id�� �� 
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
			System.out.println("p1�� p2�� ���� ����̴�.");
		}else{
			System.out.println("p1�� p2�� �ٸ� ����̴�.");
		}

		if(p1.equals(p2))
			{
				System.out.println("p1�� p2�� ���� ����̴�.");
		}else{
			System.out.println("p1�� p2�� �ٸ� ����̴�.");
		}
	}
	
	//system.exit(0); //���� ����
	//system.exit(100); //���� ����
	//system.exit(200); // �ٽ� ���� 
}
