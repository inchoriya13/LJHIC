package LJHIC_Chapter08;

public class Ch8_02_Car {
	Ch8_02_Tire frontLeftTire = new Ch8_02_HankookTire();
	Ch8_02_Tire frontRightTire = new Ch8_02_HankookTire();
	Ch8_02_Tire backLeftTire = new Ch8_02_HankookTire();
	Ch8_02_Tire backRightTire = new Ch8_02_HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
