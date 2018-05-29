package LJHIC_Chapter06;
//Getter, Setter 메소드 사용 예제
public class Ch6_17_Car {
	//필드 선언
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	/*//메소드 선언
	//speed 필드에 대한 getter 메소드 선언
	public int getSpeed() {
		return speed;
	}
	//speed 필드에 대한 setter 메소드 선언
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}
	
	//stop 필드에 대한 getter 메소드 선언
	public boolean isStop() {
		return stop;
	}
	//stop 필드에 대한 setter 메소드 선언
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}*/
}
