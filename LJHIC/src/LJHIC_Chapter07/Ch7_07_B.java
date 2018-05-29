package LJHIC_Chapter07;
	
	/*  B클래스
	 *  메소드를 선언해서
	 *  a클래스 객체 만들고 a클래스의 필드, 메소드에 접근 가능한지 확인 */

public class Ch7_07_B {
	public void method() {
		
		//A클래스의 객체 생성
		Ch7_07_A a = new Ch7_07_A(); //가능
		
		//A클래스에서 선언한 필등에 접근 가능한지
		a.field = "value"; //가능
		
		//A클래스 메소드를 가져올 수 있는지
		a.method(); //가능
	}
}
