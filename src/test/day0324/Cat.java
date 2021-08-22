package test.day0324;

public class Cat extends Animal {
	// 추상 클래스 상속받으면,.. 
	//자손 클래스는 추상 메서드를 반드시 오버라이딩 해야함 
	
	
	public void name1() { //오버라이딩
		System.out.println("고양이");
	}

}
