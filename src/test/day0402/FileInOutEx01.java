package test.day0402;

import java.util.Scanner;

//���� �Ѱ� .... 
import java.io.*;
import java.util.Scanner;  

public class FileInOutEx01 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		output();
	}
	
	public static void input() {
		FileInputStream fis = null;
		InputStreamReader ois = null;
		try {
			fis = new FileInputStream("E:\\movie\\test.txt");
			ois = new InputStreamReader(fis, "UTF-8");
			
			int i = 0;
			while(true) {
				i = ois.read();
				if(i != -1) {//i�� -1�� �ƴϸ� 
					System.out.print((char)i);
				}else {
					break;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if( fis !=null) 
				try{
					fis.close(); // stream ���� ���� 
				}catch(Exception s) {}
			
		}
	}
	
	
	
	public static void output() {
			System.out.println("���� :");
			FileOutputStream fos = null;
			byte[] b = null;
			String str = null;
			
			try {
				fos = new FileOutputStream("E:\\movie\\test.txt");
				str = s.nextLine();
				b = str.getBytes();
				fos.write(b);
				
				System.out.println("���� �ۼ� �Ϸ� !! ");
			} catch(Exception e) {
				e.printStackTrace();
				
			}finally {
				if( fos !=null) 
					try{
						fos.close(); // stream ���� ���� 
					}catch(Exception s) {}
				
			} //finally ��
			
		}
	
}
