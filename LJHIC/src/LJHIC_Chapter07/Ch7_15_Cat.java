package LJHIC_Chapter07;

public class Ch7_15_Cat extends Ch7_15_Animal{
	public Ch7_15_Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	} //Animal 클래스의 sound() 메소드를 구체적으로 재정의

}
