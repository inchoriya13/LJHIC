package LJHIC_Chapter07;

public class Ch7_06_Car {
	//필드, 메소드, final메소드
	//필드 선언
	public int speed;
	
	//메소드 선언
	public void speedUp() {
		speed += 1;
	}
	
	//final 메소드 선언
	public void speedDown() {
		speed -= 1;
	}
}