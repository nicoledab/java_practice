package test.day0323;

public class Sub extends Super { //���
	int x;
	 int z;
	 
	 Sub(){
		 super(700, 800); // ������ ������ ȣ�� 
		 this.z = 300; 
	 }
	 
	 Sub(int z){
		 this.z = z;
	 }
	 

	 
	// void add() {
	//	 System.out.println("�������̵� sub �ڼ�");
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
