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
      System.out.print("구입금액 입력:");
      int money = s.nextInt();
      int amount = money / 1000;
      s.nextLine();
      System.out.println("로또 구매 금액 : "+money+"원");
      System.out.println("로또 번호 "+amount+"회 출력");
      lottoNum(amount);
   }
   
   public static void lottoNum(int amount) {
      for(int a = 0 ; a < amount ; a++) { // 게임 횟수만큼 반복
         Set set = new HashSet();   
         for (int i = 0; set.size() < 6 ; i++) {
            int num = (int)(Math.random()*45) + 1;
            set.add(new Integer(num));
         }
         ArrayList list = new ArrayList(set);
         Collections.sort(list); // 리스트 정렬
         System.out.println(list);
      }
      /* TreeSet 이용한 정렬
      for(int a = 0 ; a < amount ; a++) { // 게임 횟수만큼 반복
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


