package LJHIC_Exercise;
import  LJHIC_Chapter07.Ch7_07_A;
public class Ch7_07_C {
	
	/*  C클래스는 다른패키지에 선언
	 *  A클래스 포함시키고
	 *  a클래스 객체 만들고 a클래스의 필드, 메소드에 접근 가능한지 확인 */
	
	//패키지가 다른 C클래스에서 A클래스의 객체생성 << 불가 >>
	//Ch7_07_A a = new Ch7_07_A();
	
	//A클래스의 선언된 필드에 접근 불가
	//a.field = "value";
	
	//A클래스 메소드 사용불가
	//a.method();
}
