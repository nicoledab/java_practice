package test.day0402;

import java.io.File;
public class FileEx01 {
	public static void main(String[] args) {

		File f = new File("C:\\Program Files\\Java\\jdk1.8.0_281");
		                 // 경로 입력
		System.out.println(f.exists()); // 결과 true    : 지정된 경로는 있는 경로다
		
		String[] fileList = f.list();
		for(String name :fileList) {
			System.out.println(name);
		}
		/*bin
		COPYRIGHT
		include
		javafx-src.zip
		jmc.txt
		jre
		legal
		lib
		LICENSE
		README.html
		release
		src.zip
		THIRDPARTYLICENSEREADME-JAVAFX.txt
		THIRDPARTYLICENSEREADME.txt*/
		
		
		//-------------
		
		
		File [] file = f.listFiles();  //new 파일 한 상태
		for(File f2: file) {
			if(f2.isFile()) {
			System.out.println("파일-"+f2.getName());
			}
			else {
			System.out.println("폴더-"+f2.getName());
			}
			
		}//for 문
		
		/*폴더-bin
		파일-COPYRIGHT
		폴더-include
		파일-javafx-src.zip
		파일-jmc.txt
		폴더-jre
		폴더-legal
		폴더-lib
		파일-LICENSE
		파일-README.html
		파일-release
		파일-src.zip
		파일-THIRDPARTYLICENSEREADME-JAVAFX.txt
		파일-THIRDPARTYLICENSEREADME.txt*/
		
	}

}
