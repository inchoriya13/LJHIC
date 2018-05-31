package LJHIC_Chapter08;

public class Ch8_1_01_Audio implements Ch8_1_01_RemoteControl {
	//필드선언
	private int volume;
	
	//인터페이스에서 선언한 turnOn() 실체메소드
	@Override
	public void turnOn() {
		System.out.println("오디오의 전원을 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("오디오의 전원을 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume>Ch8_1_01_RemoteControl.MAX_VOLUME) {
			this.volume = Ch8_1_01_RemoteControl.MAX_VOLUME;
		} else if(volume<Ch8_1_01_RemoteControl.MIN_VOLUME) {
			this.volume = Ch8_1_01_RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨 : " +  volume);
	}
	

}
