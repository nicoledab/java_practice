package test.day0317;

// Tv ���赵 ���� 
// - ���� / ä�� / �Ҹ�  
public class Tv {
	boolean power = false; // ���� (�⺻������ ��������) 
	int channel = 1; 
	int volum = 0; 
	
	
	//��� Ŭ������ �ּ� 1���̻� �����ڸ� ������ 
	//�����ڰ� �ϳ��� ������ �����Ϸ��� �ڵ��� �ǳ����� ����ִ� �⺻�����ڸ� �߰��Ѵ�.
	// �⺻�����ڶ�? - �Ű������� ���� ������ 
	//�����ڴ� - �Ű����� ������ Ÿ��, ������ �����Ѵ�, �̸����� ����x 
	
	// �Ű����� - ������(�Ұ�ȣ) ���� ���𸸵� ���� Tv(double d){ ~
	// �Ű������� �������� �̴� 
	// ����ϴ���(ȣ��)���� ���� �־��ش�. 
	Tv(){  
	}
	
	Tv(int c){
		channel = c; 
	}
	
	
	
	
	Tv(int a, int b){
		channel = b; 
	}
	Tv(double a, int b){
		channel = b; 
	}
	Tv(int a, double b){
		channel = a; 
	}
	
	Tv(int a, long b){
	}
	
	
}
