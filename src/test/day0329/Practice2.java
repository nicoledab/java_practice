package test.day0329;

public class Practice2 {
	public static void main(String[] args) {
		String data = "basic/java_web/jsp_framework/spring";
		char[] arr=data.toCharArray(); 
		//data.toCharArray()  string을 char[]로 이동시켜줌
		//35글자 있음 
		process(arr);
		System.out.println(data);
		System.out.println(process(arr));
		
		
		//
		
		String str = "sjetUhiugUIuiGIuIUiHILhTFuI";
		str.replaceAll("[a-z]", "");
		System.out.println(str);
		System.out.println(str.replaceAll("[a-z]", ""));
	}

	
	static String process(char[] arr) {
		String str = new String(arr);
		str = str.replace('/', ':');
		str = str.replace('_', ' ');
		
		return str;
		
		
		
	
		
		// 
		// 
		/* 이런방법도 있음 
		String arr2 = "";
		for(int i =0; i <arr.length; i ++) {
	        if(arr[i] == '_') {
	        	arr2 +=" ";
	        }else if(arr[i] == '/') {
	        	arr2 += ":";
	        }else {
	        	arr2+=arr[i];
	        }
		}

		return arr2;
		 * */	
	}
}
