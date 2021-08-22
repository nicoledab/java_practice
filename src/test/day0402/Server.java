package test.day0402;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {

	public static void main(String[] args) {
		ServerSocket ss= null;
		OutputStream os = null;
		ObjectOutputStream oos = null;
		try {           // "netstat -a" 로  cmd에 포트 확인 
			ss= new ServerSocket(11289); //포트 새로 입력
			while(true) {
				Socket client = ss.accept();  // 클라이언트와 연결하는 역할
				             // accept 메서드가 소켓을 리턴함
				os = client.getOutputStream(); //클라이언트 부터 아웃풋 꺼내서~
				oos = new ObjectOutputStream(os); //오브젝트(객체)로 보낸
				 System.out.println(client.getInetAddress()); //연결된 클라이언트 확인
				
				oos.writeObject(new Date());  //writeobject로 매개변수를 보냄 
				oos.flush(); // 다 끝났다. 전달해라는 강제 전송. 
				oos.close();
				os.close();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}  // 실행하면 , 깜박깜박... 

}
