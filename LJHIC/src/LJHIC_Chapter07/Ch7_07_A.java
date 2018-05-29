package LJHIC_Chapter07;

public class Ch7_07_A {
	/*
	 * A클래스
	 * 접근제한자가 protected인 필드, 생성자, 메소드 선언
	 * 
	 *  B클래스
	 *  메소드를 선언해서
	 *  a클래스 객체 만들고 a클래스의 필드, 메소드에 접근 가능한지 확인
	 *  
	 *  C클래스는 다른패키지에 선언
	 *  A클래스 포함시키고
	 *  a클래스 객체 만들고 a클래스의 필드, 메소드에 접근 가능한지 확인
	 *  
	 *  D클래스는 C클래스와 동일한 패키지에 선언
	 *  A클래스 포함시키고 A클래스 상속받고
	 *  생성자를 선언해서 부모 클래스의 필드와 메소드에 접근 가능한지 확인
	 */
	protected String field; //protected 필드선언
	
	protected Ch7_07_A() {
		
	} //protected 생성자 선언
	
	protected void method() {
		
	} //protected 메소드 선언
}
