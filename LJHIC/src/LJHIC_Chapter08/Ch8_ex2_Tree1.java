package LJHIC_Chapter08;

public class Ch8_ex2_Tree1 extends Ch8_ex2_Countable1{
	
	//생성자선언
	public  Ch8_ex2_Tree1(String name, int num) {
		super(name,num);
	}
	
	//메소드 선언
	public void rippen() {
		System.out.println(name+"에 열매가 잘 익었다.");
	}
	
	//추상메소드 구체화
	@Override
	public void count() {
		System.out.println(name+"가"+num+"그루 있다");
		
	}
}
