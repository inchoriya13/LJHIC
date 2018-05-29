package LJHIC_Chapter07;
import java.util.Scanner;
public class CH7_01_DmbCellPhoneExample {

		public static void main(String[] args) {
		// DmbCellPhone에 대한 객체 생성
		Ch7_01_DmbCellPhone phone = new Ch7_01_DmbCellPhone("galaxy","black",13);
		
		//생성한 객체의 model, color, channel 값을 각각 출력
		System.out.println("phone model : " + phone.model);
		System.out.println("phone color : " + phone.color);
		System.out.println("phone cannel : " + phone.channel);
		
		//부모 클래스에서 선언한 메소드 각각 호출
		phone.powerOn();
		phone.bell();
		phone.powerOff();
		phone.sendVoice("여보세요 나야");
		phone.receiveVoice("거기잘지내니");
		phone.sendVoice("여보세요 왜말안하니");
		phone.hangUp();
		
		//자식 클래스에서 선언한 메소드 각각 호출
		phone.turnOnDmb();
		phone.changeCannelDmb(12);
		phone.turnOffDmb();
	}

}
