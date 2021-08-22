package test.day0402;

import java.net.InetAddress;

public class IpEx01 {

	public static void main(String[] args) {

		InetAddress[] ip = null;
		try {
			ip =InetAddress.getAllByName("google.com");
			for(InetAddress a : ip) {
				System.out.println(a.getHostAddress());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	}

}
