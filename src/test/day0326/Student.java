package test.day0326;

public class Student {
	// 클래스 상수 - 초기화 방법을 활용하여 반드시 초기화 해야한다. 
	// 기본값이 적용되지 않는다.
	 public final static int cla = 1; //클래스 변수 
	 public static Student s = new Student();  
	                         //클래스 참조형 변수 
	 

	 
	 int x = 100; //인스턴스 기본형 변수 
	 int y = Student.cla; // 종류가 다르다 static 이랑 인스턴스 
     // 클래스변수에 인스턴스 변수를 대입할 수 없다. 
	// 메서드를 사용해서 대입해야한다. 
	 
	 Tv t = new Tv(); // 인스턴스 참조형 변수 
	 
	 //public static int i = x; 안됨
	 public static int i = new Student().x;
	 
	 
	 
}
