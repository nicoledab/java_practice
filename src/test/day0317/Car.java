package test.day0317;

// �� / �ӵ�/ ������ / 
public class Car {
 String color;
 int speed; 
 int door; 
 
 Car(){
	 color = "black";
	 speed = 150;
	 door = 4; 
	 
	 //this("black", 150, 4); �� ��� ����. 
	 //this �� �Ʒ��� ������. this�� �׻� ù��/ ������ �ȿ����� ��� ����. 
 }
  
 Car(String c, int s, int d){
	 color = c;
	 speed = s; 
	 door = d; 
 }
 
//obex4 ���� ȣ��! 
 
}
