package test.day0331;

//������ main ���� ! 
// ó������ �޼ҵ尡 ���´ٸ� api ���鼭 �ϱ� 

//displayMenu - menu�� �����ִ� �޼���
//inputrecord �߰� ��Ű�� �� 
//deleteRecord
//sortRecord
//displayRecord
//student2 �л� ������ �����ϴ°�


import java.io.*; 
import java.util.*; 

class StudentScore{ 
   static ArrayList record = new ArrayList(); //student ��ü ����!!
   static Scanner s = new Scanner(System.in); 

   public static void main(String args[]) { 
      while(true) { 
         switch(displayMenu()) { 
            case 1 : 
               inputRecord(); 
               break; 
            case 2 : 
               deleteRecord(); 
               break; 
            case 3 : 
               sortRecord(); 
               break; 
            case 4 : 
               System.out.println("���α׷��� �����մϴ�."); 
               System.exit(0); // 0�� �̶�� ���� �������Ḧ ����.
         } 
      } // while(true) 
   } 

   // menu�� �����ִ� �޼��� // ó�� �����Ҷ� ������ �͵� 
   static int displayMenu(){ 
      System.out.println("**************************************************"); 
      System.out.println("*                ���� ���� ���α׷�              *"); 
      System.out.println("*                   version 1.0                  *"); 
      System.out.println("*                Collection Class           *"); 
      System.out.println("**************************************************"); 
      System.out.println(); 
      System.out.println(); 
      System.out.println(" 1. �л����� �Է��ϱ� "); 
      System.out.println(); 
      System.out.println(" 2. �л����� �����ϱ� "); 
      System.out.println(); 
      System.out.println(" 3. �л����� ����"); 
      System.out.println(); 
      System.out.println(" 4. ���α׷� ���� "); 
      System.out.println(); 
      System.out.println(); 
      System.out.print("���ϴ� �޴��� �����ϼ���.(1~4) : "); 

      int menu = 0; 
      do { 
         try { 
            menu = s.nextInt(); //nextInt- �Է°��� ���ڷ� �޴� �κ��̴�. 
			s.nextLine(); //�ý��۸��� ������ �ȵǴ°͵� �־ .. �־ �ǰ� ��� ��.(������ ����) 

            if(menu >= 1 && menu <= 4) { 
               break; 
            } else { 
               throw new Exception(); //throw - ���ܸ� ������ �߻�. ��� �Ǵ� �ڵ� 
            } 
         } catch(Exception e) { //catch���� ������ else �������� ���� �� 
            System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. �ٽ� �Է����ּ���."); 
            System.out.print("���ϴ� �޴��� �����ϼ���.(1~4) : "); 
         } 
      } while(true); 

      return menu;   //�޴��� ���ư��� 
   } 
   
   
   
   
   static void inputRecord() { //�Է¹��� �������� student ��ü�� �����ϰ� record�� �����ϴ� ����
      System.out.println("1. �л����� �Է��ϱ�"); 
	  System.out.println("�̸�,�й�,�����,�����,���м���'�� ������ ������� �Է��ϼ���."); 
      System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���. ����ȭ������ ���ư��ϴ�."); 

      while(true) { 
         System.out.print(">>"); 

         do { 
            try { 
               String input = s.nextLine().trim(); // trim - �յ� ������ ���� �����ش�! 
               
               if(!input.equalsIgnoreCase("q")) {  //equalsIgnoreCase - ��ҹ��� �������� q �Է�
                  
            	   Scanner s2 = new Scanner(input).useDelimiter(",");  // ","������ �и� 
                  record.add(new Student2(s2.next(), s2.next(), s2.nextInt(),s2.nextInt(), s2.nextInt())); 
                  //�������� int���� ������ �ȵȴٸ� next()�� 
                  
                  System.out.println("���ԷµǾ����ϴ�. �Է��� ��ġ���� q�� �Է��ϼ���."); 
                  break; 
               } else { 
                  return;                         
               } 
            } catch(Exception e) { 
               System.out.println("�Է¿����Դϴ�. �̸�, �й�, �����, �����, ���м���'�� ������ �Է��ϼ���."); 
               break; 
            } 
         } while(true); 
      }
   } 


   //�й��� �Է¹޾� ���ڵ忡 ������ �����ϴ� 
   static void deleteRecord() {  //record ����
      while(true) { 
         displayRecord(); 
         System.out.println("�����ϰ��� �ϴ� �������� �й��� �Է��ϼ���.(q:����ȭ��)"); 
         System.out.print(">>"); 

         do { 
            try { 
               String input = s.nextLine().trim(); 

               if(!input.equalsIgnoreCase("q")) { 
                  int length = record.size(); 
                  boolean found = false; 

                  for(int i=0; i < length; i++) { 
                     Student2 student = (Student2)record.get(i); 
                     if(input.equals(student.studentNo)) { 
                        found = true; 
                        record.remove(i); 
                        break; 
                     } 
                  } 

                  if(found) { 
                     System.out.println("�����Ǿ����ϴ�."); 
                  } else { 
                     System.out.println("��ġ�ϴ� �����Ͱ� �����ϴ�."); 
                  } 
                  break; //q�� ������ ������ 
                  
                  
               } else { 
                  return;  //ȣ���� ������ ���ư�                        
               } 
               
            } catch(Exception e) { 
               System.out.println("�Է¿����Դϴ�. �ٽ� �Է��� �ּ���."); 
               break; 
            } 
         } while(true); // ��� ~�������� �Է� �ޱ�. 
      } 
   } //record ����
   
   
   //����� ���� ��� 
   static void sortRecord() { 
	   displayRecord(); 
   } 
 
   
   static void displayRecord() {  //3. �л����� ����
      int koreanTotal = 0; 
      int englishTotal = 0; 
      int mathTotal = 0; 
      int total = 0; 

      System.out.println(); 
      System.out.println("�̸� ��ȣ ���� ���� ���� ���� "); 
      System.out.println("======================================"); 

      int length = record.size(); 

      if(length > 0) { 
         for (int i = 0; i < length ; i++) { 
            Student2 student = (Student2)record.get(i); //(Student2)�� ����ȯ 
            System.out.println(student); 
            koreanTotal += student.koreanScore; 
            mathTotal += student.mathScore; 
            englishTotal += student.englishScore; 
            total += student.total; 
         } 
      } else { 
         System.out.println(); 
         System.out.println(" �����Ͱ� �����ϴ�."); 
         System.out.println(); 
      } 

      System.out.println("======================================"); 
      System.out.println("����: " 
         + Student2.format(koreanTotal+"", 11, Student2.RIGHT) 
         + Student2.format(englishTotal+"", 6, Student2.RIGHT) 
         + Student2.format(mathTotal+"", 6, Student2.RIGHT) 
         + Student2.format(total+"", 8, Student2.RIGHT) 
      ); 
      System.out.println(); 
   } 
} 


 // �޼��� ����� �����Ǵ� student Ŭ����. �л� ������ �����ϴ°�
class Student2 {   
   final static int LEFT = 0; 
   final static int CENTER = 1; 
   final static int RIGHT = 2; 

   String name = ""; 
   String studentNo = ""; 
   int koreanScore = 0; 
   int mathScore = 0; 
   int englishScore = 0; 
   int total = 0; 

   Student2(String name, String studentNo, int koreanScore, int mathScore, int englishScore) { 
      this.name = name; 
      this.studentNo = studentNo; 
      this.koreanScore = koreanScore; 
      this.mathScore = mathScore; 
      this.englishScore = englishScore; 
      total = koreanScore + mathScore + englishScore; 
   } 

   public String toString() { 
      return format(name, 4, LEFT) 
         + format(studentNo, 4, RIGHT) 
         + format(""+koreanScore,6, RIGHT) 
         + format(""+mathScore,6, RIGHT) 
         + format(""+englishScore, 6, RIGHT) 
         + format(""+total,8, RIGHT); 
   } 

   static String format(String str, int length, int alignment) { 
      int diff = length - str.length(); 
      if(diff < 0) return str.substring(0, length); 

      char[] source = str.toCharArray(); 
      char[] result = new char[length]; 

      for(int i=0; i < result.length; i++) 
         result[i] = ' '; 

      switch(alignment) { 
         case CENTER : 
            System.arraycopy(source, 0, result, diff/2, source.length); 
            break; 
         case RIGHT : 
            System.arraycopy(source, 0, result, diff, source.length); 
            break; 
         case LEFT : 
         default : 
            System.arraycopy(source, 0, result, 0, source.length); 
      } 
      return new String(result); 
   } 
} 