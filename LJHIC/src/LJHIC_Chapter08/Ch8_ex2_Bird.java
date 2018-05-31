package LJHIC_Chapter08;

public class Ch8_ex2_Bird implements Ch8_ex2_Countable{
	//필드선언
	String name;
	
	//생성자선언
	public Ch8_ex2_Bird(String name) {
		this.name = name;
	}

	//메소드선언
	public void fly() {
		System.out.println("2마리 "+name+"가 날아간다");
	}
	
	//추상메소드 구체화
	@Override
	public void count() {
		System.out.println(name+"가 2마리가 있다.");
		
	}
}
