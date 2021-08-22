package test.day0318;

public class MethodEx01 {
	public static void main(String[] args) {

       Test t = new Test();
       t.add(); // 호출 (실행)  -> Test로
       int x = t.sum();
		System.out.println(x);
		
		String s = new String();
		int h = s.hashCode(); 
		System.out.println(h);
		
		t.aaa(50);
		t.aaa(200);
		
		t.bbb(10, 20);
		int a = 100;
		int b =200; 
		t.bbb(a, b);
		
		//ddd 호출 
		int k = t.ddd(10, 20);
		System.out.println(k);
		
	}

}
