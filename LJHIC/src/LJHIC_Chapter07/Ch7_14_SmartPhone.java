package LJHIC_Chapter07;
//추상클래스를 상속받는 자식클래스
public class Ch7_14_SmartPhone extends Ch7_14_Phone{
	//생성자 선언
	public Ch7_14_SmartPhone(String owner) {
		super(owner);
	}
	
	//메소드 선언
	public void interentSerch(){
		System.out.println("인터넷을 검색합니다");
	}
}

