package test.day0319;
//�ʱ�ȭ 

class Tv{
	int channel = 10;  // 1. ����� �ʱ�ȭ  
	
	static int volum = 100;  // ����� �ʱ�ȭ
	
	static{ // Ŭ���� �ʱ�ȭ �� 
	  	volum = 200; 
		System.out.println("Ŭ���� ��");
	}
	//Ŭ���� �ʱ�ȭ ���� static{~} 
	
	{
		System.out.println("�ν��Ͻ� ��");
	}
	
	
	Tv(){  // 3. ������
		System.out.println("������");
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
