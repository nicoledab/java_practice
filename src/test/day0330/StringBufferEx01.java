package test.day0330;

public class StringBufferEx01 {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		
		sb.append("world");
		System.out.println(sb);
		
		sb.append(100);
		System.out.println(sb);
		
		sb.insert(0,"AAA");
		System.out.println(sb);
	}

}
