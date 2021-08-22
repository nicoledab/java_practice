package test.day0317;

// 색 / 속도/ 바퀴수 / 
public class Car {
 String color;
 int speed; 
 int door; 
 
 Car(){
	 color = "black";
	 speed = 150;
	 door = 4; 
	 
	 //this("black", 150, 4); 도 사용 가능. 
	 //this 는 아래로 보내줌. this는 항상 첫줄/ 생성자 안에서만 사용 가능. 
 }
  
 Car(String c, int s, int d){
	 color = c;
	 speed = s; 
	 door = d; 
 }
 
//obex4 에서 호출! 
 
}
