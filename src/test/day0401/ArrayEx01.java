package test.day0401;

import java.util.ArrayList;

public class ArrayEx01 {

	public static void main(String[] args) {
		//---------������ ����!!!!!
		
		
		ArrayList list = new ArrayList(); 
		//��� ������ Ÿ�� ���� ������. 
		// �⺻�� /������ ��� ���� 
		
		list.add(new Integer(100)); 
		list.add("hello");
		
		
		ArrayList list2 = new ArrayList(); 
		list2.add(10);list2.add(20);
		list.add(list2);
		System.out.println(list);  //[100, hello, [10, 20]]
		
		//list Ư¡ �ߺ����� ����Ѵ�, ������ �����ȴ�.
		
		System.out.println(list.size()); // 3 // ������ Ȯ�� 
		
		if(list.size() > 0) {
			// list.get(0); �� �ڵ常 ����.. 0��°�� ���� �ִ��� ��. ������ ���� Ȯ���ؾ���
		   Object obj = list.get(0); //object�� �ޱ�!!!!
		   
		   if(obj instanceof Integer) { //obj ���Ե� ���� integer ���� Ȯ�� 
		    Integer in = (Integer)obj;  //0��°���� int�� �����ϱ� string�� ������ 
		   }
		}
		
		
		//object�� �ְ� ����!! 
		ArrayList<Object> list3 = new ArrayList<Object>();
		// add() .......
		list.add("hello");
		
		
		
		
		
	}
}
