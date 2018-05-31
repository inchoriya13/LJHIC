package LJHIC_Chapter07;

public abstract class Ch7_15_Animal {
	//필드 선언
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상메소드 선언
	//추상메소드는 실행블록이 없고 단지 메소드 이름, 리턴타입 등만 선언
	public abstract void sound();

}
