package LJHIC_Chapter07;

/*
 * (1)적재량을 담을 수 있는 필드
 * (2)적재량 return 해주는 메소드 
 */

public class Ch7_10_Truck extends Ch7_10_Car{
	
	//필드 선언
	private int loadge;
	
	//생성자 선언
	public Ch7_10_Truck(String color, int speed, int loadge) {
		super(color,speed);
		this.loadge = loadge;
	}
	
	public int getLoadge() {
		return loadge;
	}
	
	public void setLoadge(int loadge) {
		this.loadge = loadge;
	}
	
}
