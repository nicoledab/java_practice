package test.day0322;

// 전원, 채널 , 볼륨, 가로크기, 세로크기, 제품명

//전원 - on / off : boolean 
//전원 - on / off / 절전모드 =>int (100 - on, 0 - off, 500 - 절전 )
//전원 - String ( "켜짐", "꺼짐", "절전")
// 채널 - 1,3,5,7,8,11,15,17,20,22,30,44,45,50 // int []
//볼륨 - 0~20 // int 
//크기 - int - 상수 
//제품명 = "lg", "중소기업", "sam" - String - 상수 

// Tv 기능 만들기! (모두 매서드임) 
// 전원 - power 변수의 상태를 반대로 변경한다. 
// 채널 - 채널 올리기- 마지막채널인 경우 처음채널로 변경 / 채널 내리기 - 처음채널인경우 마지막 채널로 변경
// 채널 - 입력값을 받아 채널 변경 - 채널이 없는 경우 현재 채널 유지!!
// 볼륨 - 볼륨 올리기 : 최대볼륨인 경우 변경되지 않는다.
// 음소거 - 볼륨을 0으로 만든다. 
// 음소거 해제시 이전 볼륨으로 돌아간다.
// Tv 상태 출력 ex)brand- LG, 크기 -(x*y), 전원-켜짐, 채널-11ch, 볼륨-10
// 채널 / 볼륨 기능은... 전원이 켜있을때만 동작한다. 



public class Tv {
	
 private boolean power = false;
 private int[] channel = {1,3,5,6,7,8,9,11,14,15,22}; // 이 배열의 방번호를 갖고 있을 변수를 더 선언하자
 private int indexCh = 0;// channel 
 
 private int volume;
 private int muteVol;
 private boolean mute= false;
 
 public final int x;  //상수  초기화 1가지. 명시적 초기화를 안하고 있다. x=100; (xxxx) 
 public final int y; //상수    상수는 오히려 public으로 하는게 좋음 
 public final String brand; //상수 
 
 public Tv() {  //기본생성자: 매개변수가 없는 생성자
	 //크기와 제품명을 정의한다. 
	 
	 x = 100;
	 y = 80;
	 brand = "LG";
	 
	 //this(100,80,"lg")로도 됨 - 생성자에서 다른 생성자 호출 
	 //this 쓸때는 첫줄!! 초기화
	 
 }

 public Tv(int x, int y, String brand) { // 매개변수가 3개인 생성자
	 this.x =x;
	 this.y= y;
	 this.brand = brand;
 }
 
 
 public void IsPower() // Used to turn power on and off
 {
	 this.power = !this.power; // this 넣기 
	 if(this.power) {
		 System.out.println("Tv On");
	 }
 }

 


public void ChannelUp() {
	if(this.power) {
		
		if(this.indexCh == (channel.length-1)) { //모든 배열은 기본적으로 length를 가지고 있음
			//~~~this.channel.length-1 마지막 채널을 보고있다는 뜻 
			indexCh = 0;
		}else {
			indexCh++;
		}
		System.out.println("채널 -"+ channel[indexCh]);
	}
}


public void ChannelDown() {
	if(this.power) {
		if(indexCh ==0) {
			indexCh = channel.length-1; 
		}else {
			indexCh--;
		} 
		System.out.println("채널 -"+ channel[indexCh]);
	}
}

public void ChannelChange(int ch) {
	if(this.power) {
		for(int i = 0; i <channel.length; i++) {
			if(channel[i]==ch) {
				indexCh = i; //변경된 i 값을 인덱스에 넣기
				break; // 남아있는 반복을 할 필요가 없기에...
			}
		}
		System.out.println("채널 -"+ channel[indexCh]);
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
	System.out.println("전원-" + power );
			
}
	
}
