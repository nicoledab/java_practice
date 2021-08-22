package test.day0324;

public class Runner extends Cat implements Runable, Startable {

	int speed = Startable.INDEX;
	
	public int speed() {
		if(speed <= Runable.MAXSPEED) {
			speed += 10;
		}                
		return 0;          
	}                    

	public void name() {
		System.out.println("ȫ�浿");
	}

}
