package test.day0323;

public class ExtendsEx01 {
	public static void main(String[] args) {
		
		Super su = new Sub();
		
		//su��ü�� SubŬ������ ������ �� �ִ°�? 
		if(su instanceof Sub) {
					Sub s1 = (Sub)su;
					System.out.println("���� ����");
		} else {
			System.out.println("���� �Ұ���");
		}

		
		
		
		
		
		/*
		Super su= null;
		Sub s1 = new Sub(); ���Ʒ� ����~ 
		Sub s2 = null;
		
		su =(Super) s1; //super ���� ����
		su.add();
		//su.sum(); xxxx
		
		s2 =(Sub)su; // �ڼ� <==����
		s2.add();
		s2.sum();
		
		s1.x = 0;
		s2.sum();
	*/
		
		
		
		
	}

}
