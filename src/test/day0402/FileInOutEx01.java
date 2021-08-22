package test.day0402;

import java.util.Scanner;

//내가 한거 .... 
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
				if(i != -1) {//i가 -1이 아니면 
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
					fis.close(); // stream 연결 종료 
				}catch(Exception s) {}
			
		}
	}
	
	
	
	public static void output() {
			System.out.println("내용 :");
			FileOutputStream fos = null;
			byte[] b = null;
			String str = null;
			
			try {
				fos = new FileOutputStream("E:\\movie\\test.txt");
				str = s.nextLine();
				b = str.getBytes();
				fos.write(b);
				
				System.out.println("파일 작성 완료 !! ");
			} catch(Exception e) {
				e.printStackTrace();
				
			}finally {
				if( fos !=null) 
					try{
						fos.close(); // stream 연결 종료 
					}catch(Exception s) {}
				
			} //finally 끝
			
		}
	
}
