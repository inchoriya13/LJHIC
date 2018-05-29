package LJHIC_Chapter07;
//부모클래스 CellPhone
public class Ch7_01_CellPhone {
	//필드 선언
	String model;
	String color;
	
	//메소드 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}//powerOn()
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}//powerOff()
	
	void bell() {
		System.out.println("벨이 울립니다.");
	}//bell()
	
	void sendVoice(String message) {
		System.out.println("자기 : " + message);
	}//sendVoice()
	
	void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}//receiceVoice()
	
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}//hangUp()
}
