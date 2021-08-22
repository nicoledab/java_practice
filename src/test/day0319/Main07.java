package test.day0319;


//캡슐화라고 한다 
class Person{
	private String name;  // 이름
	private int age; //나이 1~200 
	
	
	//유효성 검사
	public void setAge(int age) { //변수 age에 값을 대입
		if(age>0 && age <200) {
				this.age =age; 
		}
	}
	public int getAge() {
		return age;
	}
	
}
public class Main07 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
	
		p1.setAge(500);
	}
}
