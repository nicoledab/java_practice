package test.day0401;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestEx02_2 {
   static Scanner s = new Scanner(System.in);
   public static void main(String[] args) {
      buyLotto();
   }
   
   public static void buyLotto() {
      System.out.print("���Աݾ� �Է�:");
      int money = s.nextInt();
      int amount = money / 1000;
      s.nextLine();
      System.out.println("�ζ� ���� �ݾ� : "+money+"��");
      System.out.println("�ζ� ��ȣ "+amount+"ȸ ���");
      lottoNum(amount);
   }
   
   public static void lottoNum(int amount) {
      for(int a = 0 ; a < amount ; a++) { // ���� Ƚ����ŭ �ݺ�
         Set set = new HashSet();   
         for (int i = 0; set.size() < 6 ; i++) {
            int num = (int)(Math.random()*45) + 1;
            set.add(new Integer(num));
         }
         ArrayList list = new ArrayList(set);
         Collections.sort(list); // ����Ʈ ����
         System.out.println(list);
      }
      /* TreeSet �̿��� ����
      for(int a = 0 ; a < amount ; a++) { // ���� Ƚ����ŭ �ݺ�
         TreeSet set = new TreeSet();   
         for (int i = 0; set.size() < 6 ; i++) {
            int num = (int)(Math.random()*45) + 1;
            set.add(new Integer(num));
         }
         System.out.println(set);
      }
      */
   }
}


