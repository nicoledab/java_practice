package test.day0402;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

//서버부터 실행시켜야함!!
public class Client {  //클라이언트 동작! 클라이언트가 서버에 접속  Server의 "ss.accept();"
	public static void main(String[] args) {
		Socket client = null;
		InputStream is = null;
		ObjectInputStream ois = null;
		try {       //서버의 아이피를 알아야한다. ip+port = domain("www.naver"~같은거)
			
			client = new Socket("192.168.123.198",11289); //본인 ip, 서버에서 적었던 포트 
			is = client.getInputStream();
			ois = new ObjectInputStream(is);
			Object obj = ois.readObject();
			System.out.println("전달된 객체 : " + obj);
			
			ois.close();  //원래 finally 에다가 해야함 
			is.close();    // """
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
