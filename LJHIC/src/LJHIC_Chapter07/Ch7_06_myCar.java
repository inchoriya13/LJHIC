package LJHIC_Chapter07;

public class Ch7_06_myCar extends Ch7_06_Car{ //부모클래스 상속
	
	@Override
	public void speedUp() {
		speed += 10;
	} // 일반 메소드 재정의
	
	/*@Override
	public void stop() {
		System.out.println("내차를 멈춤");
		speed = 0;
	}*/ //final 메소드 재정의 : 재정의 불가
}
