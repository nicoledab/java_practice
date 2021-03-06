package test.day0331;

//시작은 main 부터 ! 
// 처음보는 메소드가 나온다면 api 보면서 하기 

//displayMenu - menu를 보여주는 메서드
//inputrecord 추가 시키는 곳 
//deleteRecord
//sortRecord
//displayRecord
//student2 학생 정보를 저장하는곳


import java.io.*; 
import java.util.*; 

class StudentScore{ 
   static ArrayList record = new ArrayList(); //student 객체 저장!!
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
               System.out.println("프로그램을 종료합니다."); 
               System.exit(0); // 0번 이라는 수는 정상종료를 뜻함.
         } 
      } // while(true) 
   } 

   // menu를 보여주는 메서드 // 처음 실행할때 나오는 것들 
   static int displayMenu(){ 
      System.out.println("**************************************************"); 
      System.out.println("*                성적 관리 프로그램              *"); 
      System.out.println("*                   version 1.0                  *"); 
      System.out.println("*                Collection Class           *"); 
      System.out.println("**************************************************"); 
      System.out.println(); 
      System.out.println(); 
      System.out.println(" 1. 학생성적 입력하기 "); 
      System.out.println(); 
      System.out.println(" 2. 학생성적 삭제하기 "); 
      System.out.println(); 
      System.out.println(" 3. 학생성적 보기"); 
      System.out.println(); 
      System.out.println(" 4. 프로그램 종료 "); 
      System.out.println(); 
      System.out.println(); 
      System.out.print("원하는 메뉴를 선택하세요.(1~4) : "); 

      int menu = 0; 
      do { 
         try { 
            menu = s.nextInt(); //nextInt- 입력값을 숫자로 받는 부분이다. 
			s.nextLine(); //시스템마다 개행이 안되는것도 있어서 .. 있어도 되고 없어도 됨.(있으면 좋음) 

            if(menu >= 1 && menu <= 4) { 
               break; 
            } else { 
               throw new Exception(); //throw - 예외를 강제로 발생. 없어도 되는 코드 
            } 
         } catch(Exception e) { //catch블록 내용이 else 블록으로 가도 됨 
            System.out.println("메뉴를 잘못 선택하셨습니다. 다시 입력해주세요."); 
            System.out.print("원하는 메뉴를 선택하세요.(1~4) : "); 
         } 
      } while(true); 

      return menu;   //메뉴로 돌아가기 
   } 
   
   
   
   
   static void inputRecord() { //입력받은 내용으로 student 객체에 생성하고 record에 저장하는 역할
      System.out.println("1. 학생성적 입력하기"); 
	  System.out.println("이름,학번,국어성적,영어성적,수학성적'의 순서로 공백없이 입력하세요."); 
      System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다."); 

      while(true) { 
         System.out.print(">>"); 

         do { 
            try { 
               String input = s.nextLine().trim(); // trim - 앞뒤 공백을 삭제 시켜준다! 
               
               if(!input.equalsIgnoreCase("q")) {  //equalsIgnoreCase - 대소문자 구별없이 q 입력
                  
            	   Scanner s2 = new Scanner(input).useDelimiter(",");  // ","단위로 분리 
                  record.add(new Student2(s2.next(), s2.next(), s2.nextInt(),s2.nextInt(), s2.nextInt())); 
                  //숫자인지 int인지 구별이 안된다면 next()로 
                  
                  System.out.println("잘입력되었습니다. 입력을 마치려면 q를 입력하세요."); 
                  break; 
               } else { 
                  return;                         
               } 
            } catch(Exception e) { 
               System.out.println("입력오류입니다. 이름, 학번, 국어성적, 영어성적, 수학성적'의 순서로 입력하세요."); 
               break; 
            } 
         } while(true); 
      }
   } 


   //학번을 입력받아 레코드에 저장해 삭제하는 
   static void deleteRecord() {  //record 삭제
      while(true) { 
         displayRecord(); 
         System.out.println("삭제하고자 하는 데이터의 학번을 입력하세요.(q:메인화면)"); 
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
                     System.out.println("삭제되었습니다."); 
                  } else { 
                     System.out.println("일치하는 데이터가 없습니다."); 
                  } 
                  break; //q를 누르면 멈춰짐 
                  
                  
               } else { 
                  return;  //호출한 곳으로 돌아감                        
               } 
               
            } catch(Exception e) { 
               System.out.println("입력오류입니다. 다시 입력해 주세요."); 
               break; 
            } 
         } while(true); // 계속 ~무한으로 입력 받기. 
      } 
   } //record 삭제
   
   
   //저장된 내용 출력 
   static void sortRecord() { 
	   displayRecord(); 
   } 
 
   
   static void displayRecord() {  //3. 학생성적 보기
      int koreanTotal = 0; 
      int englishTotal = 0; 
      int mathTotal = 0; 
      int total = 0; 

      System.out.println(); 
      System.out.println("이름 번호 국어 영어 수학 총점 "); 
      System.out.println("======================================"); 

      int length = record.size(); 

      if(length > 0) { 
         for (int i = 0; i < length ; i++) { 
            Student2 student = (Student2)record.get(i); //(Student2)로 형변환 
            System.out.println(student); 
            koreanTotal += student.koreanScore; 
            mathTotal += student.mathScore; 
            englishTotal += student.englishScore; 
            total += student.total; 
         } 
      } else { 
         System.out.println(); 
         System.out.println(" 데이터가 없습니다."); 
         System.out.println(); 
      } 

      System.out.println("======================================"); 
      System.out.println("총점: " 
         + Student2.format(koreanTotal+"", 11, Student2.RIGHT) 
         + Student2.format(englishTotal+"", 6, Student2.RIGHT) 
         + Student2.format(mathTotal+"", 6, Student2.RIGHT) 
         + Student2.format(total+"", 8, Student2.RIGHT) 
      ); 
      System.out.println(); 
   } 
} 


 // 메서드 실행시 생성되는 student 클래스. 학생 정보를 저장하는곳
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
