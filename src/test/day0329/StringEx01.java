package test.day0329;

public class StringEx01 {

	public static void main(String[] args) {
		 
		String str = "hello world"; //���鵵 ���� ��޵� 
		System.out.println(str.length()); // 11 // ���ڼ� ���� 
		System.out.println(str.charAt(0)); // h // ������ ��ġ�� ���� ���� 
		System.out.println(str.indexOf('e')); // 1 //������ ������ ��ġ ����
		System.out.println(str.indexOf('l')); // 2 //������ ������ ��ġ ����
		System.out.println(str.lastIndexOf('l')); // 9 //������ ������ ��ġ ����
		
		byte[] b = str.getBytes();
		System.out.println(b[0]); // 104 
		System.out.println(str.toUpperCase()); //HELLO WORLD ��� �빮�ڷ� ����
		System.out.println(str.toLowerCase()); // ��� �ҹ��ڷ� ����
		
		System.out.println(str.substring(6)); 
		// ������ ��ġ���� ������ ����. //world
		System.out.println(str.substring(6,9)); 
		//6~9 �̸����� ���� //wor
		
		System.out.println(str.replace('l', 'L'));
		//�ҹ��� l�� �빮�� L�� ���� 
		
		System.out.println(str.trim()); //������ �յ� ���� ����
		
		System.out.println(100+100); //200
		System.out.println(str.valueOf(100)+100); // 100100
		System.out.println(100+""+100); //100100
		
		String [] s = str.split(" "); //hello world�� �� �������� �и��ϴ� 
		for(String st : s) {
			System.out.println(st);
		}
		
		
		//Q.���ڿ� "hello"�� �������� ����Ͻÿ� "olleh" 
		String str2 = "hello"; 
		
		for(int i = (str2.length()-1); i >=0; i--) {
			System.out.println(str2.charAt(i));
		}System.out.println();
		
		//~~�ٸ� ����
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb.reverse());
		
		
	}

}
