package test.day0329;

public class Practice {
	public static void main(String[] args) {
		System.out.println(make("Java Data Base Conectivity"));
		System.out.println(make("Java Server Pages"));
		System.out.println(make("Enterprise Java Beans"));
	}// end main()

	public static String make(String msg) {
				String result = "";
				
				for(int i =0; i < msg.length(); i++) {
					if (i==0 || msg.charAt(i-1) == ' ') {
						result += msg.charAt(i);
					}
				}
				return result;
				
			/*String [] sp = msg.split(" ");
			
			for(String s : sp) {
				char c = s.charAt(0); 
				 //h : 0번째 인댁스 h(104)-32 = 72(아스키코드) 
			result += c ;
			}
			return result;
			*/
					
				
	}// end make()
}// end class
