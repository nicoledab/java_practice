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
		try {           // "netstat -a" ��  cmd�� ��Ʈ Ȯ�� 
			ss= new ServerSocket(11289); //��Ʈ ���� �Է�
			while(true) {
				Socket client = ss.accept();  // Ŭ���̾�Ʈ�� �����ϴ� ����
				             // accept �޼��尡 ������ ������
				os = client.getOutputStream(); //Ŭ���̾�Ʈ ���� �ƿ�ǲ ������~
				oos = new ObjectOutputStream(os); //������Ʈ(��ü)�� ����
				 System.out.println(client.getInetAddress()); //����� Ŭ���̾�Ʈ Ȯ��
				
				oos.writeObject(new Date());  //writeobject�� �Ű������� ���� 
				oos.flush(); // �� ������. �����ض�� ���� ����. 
				oos.close();
				os.close();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}  // �����ϸ� , ���ڱ���... 

}
