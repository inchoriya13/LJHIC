package LJHIC_Chapter06;

public class CH6_17_CarExample6 {
	public static void main(String[] args) {
	Ch6_17_Car myCar = new Ch6_17_Car();
	
	myCar.setSpeed(100);
	System.out.println("현재 속도 : " + myCar.getSpeed());
	
	if(!myCar.isStop()) {
		myCar.setStop(true);
	}
	System.out.println("현재 속도 : " + myCar.getSpeed());
	}
}