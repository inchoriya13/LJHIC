package LJHIC_Chapter07;

public class Ch7_16_Sedan extends Ch7_16_Car{
	//생성자 선언
	public Ch7_16_Sedan(int speed, String color){
		super(speed, color);
	}
	
	//추상메소드 구체화
	@Override
	void work() {
		System.out.println("승용차는 사람을 실을 수 있습니다.");
	}
}
