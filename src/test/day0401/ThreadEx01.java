package test.day0401;

//thread Ŭ���� ��� / runnable �������̽� ���� 

//�ѹ��� �ΰ��� �����Ѵ�. 

class MyThread extends Thread{
	//���⿡ run �޼��� �������̵��Ѵ�. 
	public void run() { // ��ӹ��� run() �������̵� 
		for (int i =0; i < 100; i ++) { //true -���� 
			System.out.print("1");
		}
		
	}
}

public class ThreadEx01 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		MyThread mt2 = new MyThread();
		
		mt.start(); //start �޼��� ȣ��. �ٵ� run()�� �����Ѵ�?
		mt2.start();
		for (int i =0; i < 10; i ++) {
			System.out.print("0");
		}
		System.out.println("����");
		
		
	}

}




