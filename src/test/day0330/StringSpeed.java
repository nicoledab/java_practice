package test.day0330;

public class StringSpeed {

	public static void main(String[] args) {

		String str = "1";
		long start = System.currentTimeMillis(); 
		// ����ð��� 1000/1 ���� 
		
		for(int a =0; a < 100000; a++) {
			str +=a;
		}
		long end = System.currentTimeMillis(); 
		 System.out.println(end - start);
		 
		 //---buffer �ӵ��� �� ������ 
		 StringBuffer sb = new StringBuffer("");
		 start = System.currentTimeMillis();
		 for(int a =0; a < 100000; a++) {
			 sb.append(a);
		 }
		 end = System.currentTimeMillis(); 
		 System.out.println(end - start);
		 
		 
		 
	}

}
