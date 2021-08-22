package test.day0322;

// ����, ä�� , ����, ����ũ��, ����ũ��, ��ǰ��

//���� - on / off : boolean 
//���� - on / off / ������� =>int (100 - on, 0 - off, 500 - ���� )
//���� - String ( "����", "����", "����")
// ä�� - 1,3,5,7,8,11,15,17,20,22,30,44,45,50 // int []
//���� - 0~20 // int 
//ũ�� - int - ��� 
//��ǰ�� = "lg", "�߼ұ��", "sam" - String - ��� 

// Tv ��� �����! (��� �ż�����) 
// ���� - power ������ ���¸� �ݴ�� �����Ѵ�. 
// ä�� - ä�� �ø���- ������ä���� ��� ó��ä�η� ���� / ä�� ������ - ó��ä���ΰ�� ������ ä�η� ����
// ä�� - �Է°��� �޾� ä�� ���� - ä���� ���� ��� ���� ä�� ����!!
// ���� - ���� �ø��� : �ִ뺼���� ��� ������� �ʴ´�.
// ���Ұ� - ������ 0���� �����. 
// ���Ұ� ������ ���� �������� ���ư���.
// Tv ���� ��� ex)brand- LG, ũ�� -(x*y), ����-����, ä��-11ch, ����-10
// ä�� / ���� �����... ������ ���������� �����Ѵ�. 



public class Tv {
	
 private boolean power = false;
 private int[] channel = {1,3,5,6,7,8,9,11,14,15,22}; // �� �迭�� ���ȣ�� ���� ���� ������ �� ��������
 private int indexCh = 0;// channel 
 
 private int volume;
 private int muteVol;
 private boolean mute= false;
 
 public final int x;  //���  �ʱ�ȭ 1����. ����� �ʱ�ȭ�� ���ϰ� �ִ�. x=100; (xxxx) 
 public final int y; //���    ����� ������ public���� �ϴ°� ���� 
 public final String brand; //��� 
 
 public Tv() {  //�⺻������: �Ű������� ���� ������
	 //ũ��� ��ǰ���� �����Ѵ�. 
	 
	 x = 100;
	 y = 80;
	 brand = "LG";
	 
	 //this(100,80,"lg")�ε� �� - �����ڿ��� �ٸ� ������ ȣ�� 
	 //this ������ ù��!! �ʱ�ȭ
	 
 }

 public Tv(int x, int y, String brand) { // �Ű������� 3���� ������
	 this.x =x;
	 this.y= y;
	 this.brand = brand;
 }
 
 
 public void IsPower() // Used to turn power on and off
 {
	 this.power = !this.power; // this �ֱ� 
	 if(this.power) {
		 System.out.println("Tv On");
	 }
 }

 


public void ChannelUp() {
	if(this.power) {
		
		if(this.indexCh == (channel.length-1)) { //��� �迭�� �⺻������ length�� ������ ����
			//~~~this.channel.length-1 ������ ä���� �����ִٴ� �� 
			indexCh = 0;
		}else {
			indexCh++;
		}
		System.out.println("ä�� -"+ channel[indexCh]);
	}
}


public void ChannelDown() {
	if(this.power) {
		if(indexCh ==0) {
			indexCh = channel.length-1; 
		}else {
			indexCh--;
		} 
		System.out.println("ä�� -"+ channel[indexCh]);
	}
}

public void ChannelChange(int ch) {
	if(this.power) {
		for(int i = 0; i <channel.length; i++) {
			if(channel[i]==ch) {
				indexCh = i; //����� i ���� �ε����� �ֱ�
				break; // �����ִ� �ݺ��� �� �ʿ䰡 ���⿡...
			}
		}
		System.out.println("ä�� -"+ channel[indexCh]);
	}
}


public void increaseVolume() // Used to increase the volume
{
	if(this.power) {
		if(this.volume != 20) {
			volume++;
		}
	} 
}


public void decreaseVolume() // Used to decrease the volume
{
	if(this.power) {
		if(this.volume !=0) {
			volume--;
		}
	} 
}


public void muteVolume()
{ 
	if(this.power) {
		this.mute = !this.mute;
	if(this.mute) {
		muteVol = volume;
			volume = 0;
	}else {
		volume = muteVol;	}
	
	}
}



public void print()
{
	System.out.println(brand+"tv("+x+" * "+y+")");
	System.out.println("����-" + power );
			
}
	
}
