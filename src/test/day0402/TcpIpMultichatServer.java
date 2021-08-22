package test.day0402;

import java.net.*;
import java.io.*;
import java.util.*;




public class TcpIpMultichatServer {
	HashMap clients; //hashmap에 아웃풋을 저장 
	
	TcpIpMultichatServer() {
		clients = new HashMap();
		Collections.synchronizedMap(clients);
	}

	public void start() {
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(111142); //포트 
			System.out.println("서버가 시작되었습니다.");

			while(true) {
				socket = serverSocket.accept(); ///사용자가 오기를 기다림 
				System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]"+"에서 접속하였습니다.");
				ServerReceiver thread = new ServerReceiver(socket); //매개변수로 소캣
				thread.start();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	} // start()

	void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator();
		
		while(it.hasNext()) {
			try {
				DataOutputStream out = (DataOutputStream)clients.get(it.next());
				out.writeUTF(msg);
			} catch(IOException e){}
		} // while
	} // sendToAll

	public static void main(String args[]) {
		new TcpIpMultichatServer().start();
	} 
	
	
	class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;

		ServerReceiver(Socket socket) {
			this.socket = socket;
			try { //input과 아웃풋 
				in  = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch(IOException e) {}
		}

		public void run() {
			String name = "";
			try {
				name = in.readUTF();
				sendToAll("#"+name+"님이 들어오셨습니다.");

				clients.put(name, out);
				System.out.println("현재 서버접속자 수는 "+ clients.size()+"입니다.");

				while(in!=null) {   //null이 아닐때 
					sendToAll(in.readUTF());
				}
			} catch(IOException e) {
				// ignore
			} finally {
				sendToAll("#"+name+"님이 나가셨습니다.");
				clients.remove(name);
				System.out.println("["+socket.getInetAddress() +":"+socket.getPort()+"]"+"에서 접속을 종료하였습니다.");
				System.out.println("현재 서버접속자 수는 "+ clients.size()+"입니다.");
			} // try
		} // run
	} // ReceiverThread
} // class