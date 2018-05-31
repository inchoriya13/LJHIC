package LJHIC_Chapter08;

public class Ch8_ex2_Tree implements Ch8_ex2_Countable{
	//필드선언
	String name;
	
	//생성자선언
	public  Ch8_ex2_Tree(String name) {
		this.name = name;
	}
	
	//메소드 선언
	public void rippen() {
		System.out.println(name+"에 열매가 잘 익었다.");
	}
	
	//추상메소드 구체화
	@Override
	public void count() {
		System.out.println(name+"가 5그루 있다");
		
	}
}
