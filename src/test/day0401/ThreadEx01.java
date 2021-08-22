package test.day0401;

//thread 클래스 상속 / runnable 인터페이스 구현 

//한번에 두개가 동작한다. 

class MyThread extends Thread{
	//여기에 run 메서드 오버라이딩한다. 
	public void run() { // 상속받은 run() 오버라이딩 
		for (int i =0; i < 100; i ++) { //true -무한 
			System.out.print("1");
		}
		
	}
}

public class ThreadEx01 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		MyThread mt2 = new MyThread();
		
		mt.start(); //start 메서드 호출. 근데 run()이 동작한다?
		mt2.start();
		for (int i =0; i < 10; i ++) {
			System.out.print("0");
		}
		System.out.println("종료");
		
		
	}

}




