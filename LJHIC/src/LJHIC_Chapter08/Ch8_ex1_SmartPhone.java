package LJHIC_Chapter08;

public class Ch8_ex1_SmartPhone extends Ch8_ex1_PDA implements Ch8_ex1_MobilePhone, Ch8_ex1_Mp3{

	@Override
	public void sendSms() {
		// TODO Auto-generated method stub
		System.out.println("메세지를 보냅니다.");
	}

	@Override
	public void recieveSms() {
		// TODO Auto-generated method stub
		System.out.println("메세지를 받습니다.");
	}

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("전화를 겁니다.");
	}

	@Override
	public void recieveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화를 받습니다.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("음악을 재생합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("음악을 정지합니다.");
	}
	
	
	
}
