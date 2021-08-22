package test.day0329;

public class StringEx01 {

	public static void main(String[] args) {
		 
		String str = "hello world"; //공백도 문자 취급됨 
		System.out.println(str.length()); // 11 // 문자수 리턴 
		System.out.println(str.charAt(0)); // h // 지정된 위치의 문자 리턴 
		System.out.println(str.indexOf('e')); // 1 //지정된 문자의 위치 리턴
		System.out.println(str.indexOf('l')); // 2 //지정된 문자의 위치 리턴
		System.out.println(str.lastIndexOf('l')); // 9 //지정된 문자의 위치 리턴
		
		byte[] b = str.getBytes();
		System.out.println(b[0]); // 104 
		System.out.println(str.toUpperCase()); //HELLO WORLD 모두 대문자로 리턴
		System.out.println(str.toLowerCase()); // 모두 소문자로 리턴
		
		System.out.println(str.substring(6)); 
		// 지정된 위치부터 끝까지 복사. //world
		System.out.println(str.substring(6,9)); 
		//6~9 미만까지 복사 //wor
		
		System.out.println(str.replace('l', 'L'));
		//소문자 l을 대문자 L로 변경 
		
		System.out.println(str.trim()); //문장의 앞뒤 공백 제거
		
		System.out.println(100+100); //200
		System.out.println(str.valueOf(100)+100); // 100100
		System.out.println(100+""+100); //100100
		
		String [] s = str.split(" "); //hello world를 빈 공백으로 분리하는 
		for(String st : s) {
			System.out.println(st);
		}
		
		
		//Q.문자열 "hello"를 역순으로 출력하시오 "olleh" 
		String str2 = "hello"; 
		
		for(int i = (str2.length()-1); i >=0; i--) {
			System.out.println(str2.charAt(i));
		}System.out.println();
		
		//~~다른 버전
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb.reverse());
		
		
	}

}
