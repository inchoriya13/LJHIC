package LJHIC_Chapter08;

public interface Ch8_ex1_Phone {
	//버튼 10개 선언
	int BUTTONS = 10;
	
	//전화걸고 , 받는 추상 메소드
	void sendCall();
	void recieveCall();
}
