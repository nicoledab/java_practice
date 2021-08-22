package test.day0322;

public class Tvex { //practice 

	private boolean power = false;
	private int[] channel = {1,3,5,6,7,8}; 
	private int indexch =0; 
	
	private int volume; 
	private int mutevol; 
	private boolean mute = false; 
	
	public int x;
	public int y; 
	public String brand; 
	
	
	public Tvex() {
		x = 100;
		y= 50;
		brand = "lg";
	}
	
	
	
	public Tvex(int x, int y, String brand) {
		this.x = x;
		this.y = y;
		this.brand = brand; 
		
	}
	
	
	public void Ispower() {
		power = !power; 
		if(this.power) {
			System.out.println("tv on ");
		}
	}
	
	
	public void channelup() {
		if (this.power) {
			if(this.indexch == channel.length-1 ) {
				indexch = 0;
			} else {
				indexch ++;
			}
			System.out.println("채널:" + channel[indexch]);
		}
		
	}
	
	
	
	public void channeldown() {
		if (this.power) {
			if(this.indexch == 0 ) {
				indexch = channel.length - 1;
			} else {
				indexch --;
			}
			System.out.println("채널:" + channel[indexch]);
		}
		
	}
	
	
	
	public void chChange(int ch) {
		if(this.power) {
			
			for(int i=0; i < channel.length; i ++) {
				if(channel[i] == ch) {
					indexch = i;
					break;
				}
			}
			System.out.println("채널:" + channel[indexch]);
		}
	}
	
	
	public void volumeup() {
		if(this.power) {
			if(this.volume != 20 ) {   //최대 20이라고했으니
			
				volume ++;
				
			}
			
		}
		
	}
	
	public void volumedown() {
		if(this.power) {
			if(this.volume != 0 ) {   //최대 20이라고했으니
			
				volume --;
				
			}
			
		}
		
	}
	
	
	public void volumeMute() {
		if(this.power) {
			
			this.mute = !this.mute;
			
			if(this.mute) {
			  mutevol = volume;
			  volume = 0;
			}else {
					volume = mutevol;
			}
			
		}
	}
	
	
	

}

