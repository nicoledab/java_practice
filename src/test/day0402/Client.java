package test.day0402;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

//�������� ������Ѿ���!!
public class Client {  //Ŭ���̾�Ʈ ����! Ŭ���̾�Ʈ�� ������ ����  Server�� "ss.accept();"
	public static void main(String[] args) {
		Socket client = null;
		InputStream is = null;
		ObjectInputStream ois = null;
		try {       //������ �����Ǹ� �˾ƾ��Ѵ�. ip+port = domain("www.naver"~������)
			
			client = new Socket("192.168.123.198",11289); //���� ip, �������� ������ ��Ʈ 
			is = client.getInputStream();
			ois = new ObjectInputStream(is);
			Object obj = ois.readObject();
			System.out.println("���޵� ��ü : " + obj);
			
			ois.close();  //���� finally ���ٰ� �ؾ��� 
			is.close();    // """
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
