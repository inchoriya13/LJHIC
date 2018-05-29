package LJHIC_Chapter07;

public class CH7_04_AirplaneMain {

	public static void main(String[] args) {

		Ch7_04_SupersonicAirplane air = new Ch7_04_SupersonicAirplane();
		air.takeoff();
		air.fly();
		air.flyMode = Ch7_04_SupersonicAirplane.SUPERSONIC;
		air.fly();
		air.flyMode = Ch7_04_SupersonicAirplane.NORMAL;
		air.fly();
		air.land();

	}

}
