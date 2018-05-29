package LJHIC_Chapter07;

/*
 * (1)색, 속도를 담을 수 있는 필드
 * (2)속도 증가 처리용 메소드
 * (3)속도 감소 처리용 메소드
 */

public class Ch7_10_Car {
	//필드 선언
	public String color;
	public int speed;
	
	//생성자
	public Ch7_10_Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	//속도 증가 메소드
	public void speedUp(int speed) {
		this.speed = this.speed + speed;
	}
	
	//속도 감소 메소드
	public void speedDown(int speed) {
		this.speed = this.speed - speed;
	}
}