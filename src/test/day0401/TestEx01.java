package test.day0401;

import java.util.*;
public class TestEx01 {

	public static void main(String[] args) {
		/* 
		1.  �迭�� �ߺ��� �����͸� �����ϰ�  ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (��������½� ������ �������)
		arr[] = {10, 20, 30, 40, 50, 60, 70, 40, 30, 20} 

	[���]
	10	true
	20	true
	30	true
	40	true
	50	true
	60	true
	70	true
	40	�ߺ�
	30	�ߺ�
	20	�ߺ�
	  */

	 int arr[] = {10, 20, 30, 40, 50, 60, 70, 40, 30, 20} ;
			 add(arr); 	
	}

	private static void add(int[] arr) {
	
		/* -----------------------------------set�� �̿��ϴ� ���
		Set set = new HashSet();
		for( int i : arr) { //int i�� arr��ŭ �ݺ��Ѵ� 
			
			String result = i + "-----" + (  set.add(i) ? "true" : "�ߺ�"  ); // ���� ������
			System.out.println(result);	
		}
		
		//add �޼ҵ� ��: �����Ͱ� �� ������ true. 
		*/
		
		
		//--------------------------------list �̿��ϴ� ���
		List list = new ArrayList();
		for (int i : arr) {
			if(list.contains(i)) {  //����Ʈ�� ���� ������ true
				System.out.println(i +"  �ߺ�");
				
			}else {
				list.add(i);
				System.out.println(i +"  "+true);
			}
		}
		
		
		
	}

}
