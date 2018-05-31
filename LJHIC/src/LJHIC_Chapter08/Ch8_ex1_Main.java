package LJHIC_Chapter08;

public class Ch8_ex1_Main {

	public static void main(String[] args) {
		Ch8_ex1_SmartPhone sp = new Ch8_ex1_SmartPhone();
		
		sp.sendCall();
		sp.recieveCall();
		sp.sendSms();
		sp.recieveSms();
		sp.play();
		sp.stop();
		sp.plus(3, 5);
	}

}
