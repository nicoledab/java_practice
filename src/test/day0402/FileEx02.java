package test.day0402;


// �ٸ� ����̺꿡 ���� // D:����̺� 
import java.io.File;
import java.io.IOException;
import java.util.Date;
public class FileEx02 {

	public static void main(String[] args) {
		delete();
	}
	
	public static void info() {
		File f= new File("E:\\movie\\start.pdf");
		System.out.println("����ũ�� :" + f.length()); // f.length - ����ũ��
		System.out.println("���ϰ�� :" + f.getPath());
		System.out.println("�����б� :" + f.canRead());
		System.out.println("���Ͼ��� :" + f.canWrite());
		System.out.println("���Ͻ��� :" + f.canExecute());
		System.out.println("���ϼ��� :" + f.isHidden());
		System.out.println("���� ������¥ :" + new Date(f.lastModified()));
	}
	
	
	public static void delete() {
		File f= new File("E:\\movie\\test.txt");
		if(f.exists()) {  //������ ����. 
			f.delete();    
		}
	}
	
	
	public static void newFile() {
		File f= new File("E:\\movie\\test.txt");
		System.out.println(f.exists());
		
		try {  //����ó��! throw ����.. �׳� createNewFile ���� ������.
			System.out.println(f.createNewFile()); //true - ����� �����Ǿ��� 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
