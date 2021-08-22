package test.day0323;

public class Sub extends Super { //상속
	int x;
	 int z;
	 
	 Sub(){
		 super(700, 800); // 조상의 생성자 호출 
		 this.z = 300; 
	 }
	 
	 Sub(int z){
		 this.z = z;
	 }
	 

	 
	// void add() {
	//	 System.out.println("오버라이딩 sub 자손");
	 //}
	 

	 void sum() {
		 int x =10;
		 System.out.println(x); //10   this.x
		 System.out.println(super.x); //100
		 System.out.println(this.x);
		 System.out.println(super.y);
		 System.out.println(this.z);
	 }
		
}
