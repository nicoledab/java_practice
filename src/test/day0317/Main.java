package test.day0317;

public class Main {

	public static void main(String[] args) {

		//��ü ����� ��� 
		// ���� => Ŭ������ ������;
		// ���� => ������ = new Ŭ������ ();
		// Ŭ����, �迭 = ������ �����ͤ���
		Tv t; 
		t = new Tv();  //new�� �޸�- �� ��ǰ�� ����� �ִ� ����. tv ��������! 
		//���� ��Ű�� �ȿ� Tv�� �������Ƽ� ������.. 
		//������ �޼ҵ� �� ��ŭ �޸𸮰� �����ȴ�. 
		Car c = new Car(); // car ����!
		Test t1 = new Test();
		Main m = new Main(); 
		int [] a = new int[3];
		
		//���� ���赵�� ������ .. Tv�� 3�� �����ߴ�.. 
		// tv1, tv2, tv3 �������� 
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		Tv tv3 = new Tv();
		System.out.println(tv1);
		System.out.println(tv2);
		System.out.println(tv3);
		
		String s = new String();
		
		
	}

}
