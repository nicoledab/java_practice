package test.day0319;


//ĸ��ȭ��� �Ѵ� 
class Person{
	private String name;  // �̸�
	private int age; //���� 1~200 
	
	
	//��ȿ�� �˻�
	public void setAge(int age) { //���� age�� ���� ����
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
