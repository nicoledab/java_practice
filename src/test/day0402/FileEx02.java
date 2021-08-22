package test.day0402;


// 다른 드라이브에 생성 // D:드라이브 
import java.io.File;
import java.io.IOException;
import java.util.Date;
public class FileEx02 {

	public static void main(String[] args) {
		delete();
	}
	
	public static void info() {
		File f= new File("E:\\movie\\start.pdf");
		System.out.println("파일크기 :" + f.length()); // f.length - 파일크기
		System.out.println("파일경로 :" + f.getPath());
		System.out.println("파일읽기 :" + f.canRead());
		System.out.println("파일쓰기 :" + f.canWrite());
		System.out.println("파일실행 :" + f.canExecute());
		System.out.println("파일숨김 :" + f.isHidden());
		System.out.println("파일 수정날짜 :" + new Date(f.lastModified()));
	}
	
	
	public static void delete() {
		File f= new File("E:\\movie\\test.txt");
		if(f.exists()) {  //있으면 삭제. 
			f.delete();    
		}
	}
	
	
	public static void newFile() {
		File f= new File("E:\\movie\\test.txt");
		System.out.println(f.exists());
		
		try {  //예외처리! throw 말고.. 그냥 createNewFile 쓰면 빨간줄.
			System.out.println(f.createNewFile()); //true - 제대로 생성되었다 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
