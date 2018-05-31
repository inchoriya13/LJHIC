package LJHIC_Chapter08;
//인터페이스 RemoteControl의 구현클래스
public class Ch8_1_01_Television implements Ch8_1_01_RemoteControl {
	//필드선언
	private int volume;
	private boolean mute;
	
	//인터페이스에서 선언한 turnOn() 실체메소드
	@Override
	public void turnOn() {
		System.out.println("TV 전원을 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV 전원을 끕니다.");
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
		System.out.println("현재 TV 볼륨 : " +  volume);
	}
	
	@Override
	//default에서 public으로 접근제한 변경
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("TV 음소거 사용");
		} else {
			System.out.println("TV 음소거 해제");
		}
	}
	

}
