package test.day0323;

public class PolyEx01 {

	public static void main(String[] args) {

		
		int [] a = new int[3]; //�⺻�� �迭 
		Super [] s = new Super[3]; //������ �迭
		/*�������� �⺻���� ? null 
		 * 
		 * �� Super [] s = new Super[3];�� 
		Super s1 = null;
		Super s1 = null;
		Super s1 = null;
		�̰Ŷ� ��������. ��ü�� �����Ѱ� �ƴ϶� �迭�� ������ ����
		*/
		s[0] = new Super();
		s[1] = new Super();
		s[2] = new Super();
		System.out.println(s);
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		Super s0 = new Super();
		System.out.println(s0.x );
		System.out.println(s[0].x );
		
		
	
		
		
		
	}

}
