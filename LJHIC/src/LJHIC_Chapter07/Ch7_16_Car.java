package LJHIC_Chapter07;

public abstract class Ch7_16_Car {
	//필드 선언
	public int speed;
	public String color;
	
	public Ch7_16_Car(int speed, String color) {
		this.speed = speed;
		this.color = color;
	}
	
	//추상메소드 선언
	abstract void work();
	

}
