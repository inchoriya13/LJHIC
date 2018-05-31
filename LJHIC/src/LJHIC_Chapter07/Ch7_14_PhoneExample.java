package LJHIC_Chapter07;

public class Ch7_14_PhoneExample {

	public static void main(String[] args) {
		//자식클래스의 객체 생성
		Ch7_14_SmartPhone smartphone = new Ch7_14_SmartPhone("소유자");

		//추상클래스의 객체 생성
		//Ch7_14_Phone phone = new Ch7_14_Phone("소유자");
		
		smartphone.turnOn();
		smartphone.turnOff();
		smartphone.interentSerch();

	}

}
