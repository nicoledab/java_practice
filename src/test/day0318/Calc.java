package test.day0318;

public class Calc {
    
	//�����ε� - �̸��� ������ / �Ű����� ������ Ÿ��, ��������� �����Ѵ�.
	int sum( int x, int y) {
		int result = x+y;
		return result;
		
		//return x+y; -> ���ε� ���� 
	}
	
	
	double sum(double x, double y) {
		return x+y; 
	}
	
	double sum(int x, double y) {
		return x+y; 
	}
	
	
}
