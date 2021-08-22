package test.day0401;

import javax.swing.JOptionPane;

class ThreadEx6 {
	public static void main(String[] args) throws Exception{
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요."); 
		//   입력창이 뜬다 
		
		
		System.out.println("입력하신 값은 " + input + "입니다.");
		for(int i=10; i > 0; i--) { //감소 
			System.out.println(i);
			try {  //얘는 예외처리 되었음 왜?
				Thread.sleep(1000); // sleep 메소드: 지정된 시간동안 스레드를 일시정지 시킴.
			} catch(Exception e ) {}
		}
		
	}
}
