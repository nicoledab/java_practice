package test.day0402;

import java.io.File;
public class FileEx01 {
	public static void main(String[] args) {

		File f = new File("C:\\Program Files\\Java\\jdk1.8.0_281");
		                 // ��� �Է�
		System.out.println(f.exists()); // ��� true    : ������ ��δ� �ִ� ��δ�
		
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
		
		
		File [] file = f.listFiles();  //new ���� �� ����
		for(File f2: file) {
			if(f2.isFile()) {
			System.out.println("����-"+f2.getName());
			}
			else {
			System.out.println("����-"+f2.getName());
			}
			
		}//for ��
		
		/*����-bin
		����-COPYRIGHT
		����-include
		����-javafx-src.zip
		����-jmc.txt
		����-jre
		����-legal
		����-lib
		����-LICENSE
		����-README.html
		����-release
		����-src.zip
		����-THIRDPARTYLICENSEREADME-JAVAFX.txt
		����-THIRDPARTYLICENSEREADME.txt*/
		
	}

}
