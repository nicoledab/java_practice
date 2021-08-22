package test.day0402;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Scanner; 

public class TeachersCodeinoutPut {
   static Scanner s = new Scanner(System.in);
   public static void main(String[] args) {
      output();
   } 
   
   //���ڵ��� �����ϱ� 
   public static void input() {
	      FileInputStream fis = null;
	      InputStreamReader ois = null;  //---------�ѱ���ġ ���ڵ�
	      try {
	         fis = new FileInputStream("E:\\movie\\test.txt");
	         ois = new InputStreamReader(fis, "MS949");  //�ȵǸ� UTF-8 

	         int i = 0;
	         while(true) {
	            i = ois.read(); //---------���ڵ�
	            if(i != -1) {
	               System.out.print((char)i);
	            }else {
	               break;
	            }
	         }
	      }catch(Exception e) {
	         e.printStackTrace();
	      }finally {
	         if(fis != null)try{fis.close();}catch(Exception s) {}
	         if(ois != null)try{fis.close();}catch(Exception s) {} //���ڵ�
	      }
	   }
   
   
   
   public static void output() { 
      System.out.print("����:");
      FileOutputStream fos=null;
      byte [] b=null;
      String str=null;
      try {
         fos = new FileOutputStream("E:\\movie\\test.txt");
         str = s.nextLine();
         b = str.getBytes();
         fos.write(b);
         System.out.println("���� �ۼ� �Ϸ�!!");
      } catch (Exception e) {
         e.printStackTrace();
      }finally {
         if(fos != null)try{fos.close();}catch(Exception s) {}
      }
   }
}