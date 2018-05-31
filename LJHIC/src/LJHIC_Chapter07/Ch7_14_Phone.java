package LJHIC_Chapter07;

public abstract class Ch7_14_Phone {
	public String owner;
	
	public Ch7_14_Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
