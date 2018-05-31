package LJHIC_Chapter08;

public abstract class Ch8_ex2_Countable1 {
	//필드선언
	protected String name;
	protected int num;
	
	//생성자선언
	Ch8_ex2_Countable1(String name, int num){
		this.name = name;
		this.num = num;
	}
	
	//getter, setter 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	//추상메소드
	public abstract void count();
}
