package LJHIC_Chapter08;

public class CH8_1_01_RemoteControllerExample {

	public static void main(String[] args) {
		//인터페이스 타입의 변수 선언
		Ch8_1_01_RemoteControl rc;
		//Ch8_1_01_RemoteControl rc = new Ch8_1_01_Television();
		
		//각가의 객체를 인터페이스 타입 변수에 대입
		
		//Television 객체를 rc에 대입
		//따라서 rc는 Television객체가 됨
		rc = new Ch8_1_01_Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		//Audio 객체를 rc에 대입
		//여기서 rc는 Audio객체가 됨
		rc = new Ch8_1_01_Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(false);
		
		Ch8_1_01_RemoteControl.changeBettery();

	}

}
