package test.day0331;

import java.util.Stack;
public class StackEx01 {

	public static void main(String[] args) {
		 Stack s = new Stack();
		 s.push("네이버");
		 s.push("뉴스");
		 s.push("기사");
		 
		 System.out.println(s);
		 //System.out.println(s.peek());
		// System.out.println(s.peek());
		 System.out.println(s.pop());
		 System.out.println(s.pop());
		 //마지막에 들어온게 먼저 나온다 
		 
		 
	}

}
