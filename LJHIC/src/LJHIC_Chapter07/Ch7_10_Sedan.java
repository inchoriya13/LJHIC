package LJHIC_Chapter07;

/*
 * (1)좌석수를 담을 수 있는 필드
 * (2)좌석수를 return 해주는 메소드
 */

public class Ch7_10_Sedan extends Ch7_10_Car {
	//필드 선언
	private int seat;
		
	//생성자 선언
	public Ch7_10_Sedan(String color, int speed, int seat) {
		super(color,speed);
		this.seat = seat;
	}
	
	public int getSeat() {
		return seat;
	}
	
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
}
