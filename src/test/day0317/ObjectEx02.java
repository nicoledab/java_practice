package test.day0317;

public class ObjectEx02 {

	public static void main(String[] args) {
        //��ü���� - �����ڱ��� ������ ��ģ��!! 
		Tv t1 = new Tv(); // ������ ���������� ObjectEx02������ ���δ� 
		// new �޸� ���� �� �ʱ�ȭ 
		System.out.println(t1.channel);  // 100 
		
		Car c1 = new Car(); // 
		
		System.out.println(c1.color);   //black
		
		//Car c3 = new Car("red", 200); //2��¥�� �����ڿ� ����
		//Car c4 = new car(100, "blue"); ������; ������ ������ ������Ѵ�.
		//Car c5 = new Car(200); ������; ������ Ÿ���� �Ȱ��ƾ��Ѵ�.
	    //Car c6 = new Car("red", 200, 200); ������;
		
	}

}
