package LJHIC_Chapter08;

public class Ch8_ex2_Bird1 extends Ch8_ex2_Countable1{
	
	//생성자선언
	public Ch8_ex2_Bird1(String name, int num){
		super(name,num);
	}

	//메소드선언
	public void fly() {
		System.out.println(num+"마리 "+name+"가 날아간다");
	}
	
	//추상메소드 구체화
	@Override
	public void count() {
		System.out.println(name+"가"+num+"마리가 있다.");
		
	}
}
