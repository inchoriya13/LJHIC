package LJHIC_Chapter08;

public class Ch8_02_CarExample {

	public static void main(String[] args) {
		Ch8_02_Car myCar = new Ch8_02_Car();
		
		myCar.run();
		System.out.println("------타이어 교체------");
		
		myCar.frontLeftTire = new Ch8_02_KumhoTire();
		myCar.frontRightTire = new Ch8_02_KumhoTire();
		
		myCar.run();

	}

}
