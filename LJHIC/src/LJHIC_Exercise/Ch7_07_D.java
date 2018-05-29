package LJHIC_Exercise;
import  LJHIC_Chapter07.Ch7_07_A; // A클래스를 상속받기 위해 패키지 상속
	
	/*  D클래스는 C클래스와 동일한 패키지에 선언
	 *  A클래스 포함시키고 A클래스 상속받고
	 *  생성자를 선언해서 부모 클래스의 필드와 메소드에 접근 가능한지 확인 */

public class Ch7_07_D extends Ch7_07_A { //다른 패키지에 있는 A클래스 상속
	public Ch7_07_D() { //D클래스 새로 정의
		
		//A클래스의 객체 생성하기 위한 super()문 사용
		super(); 
		
		//A클래스의 필드에 접근 가능
		this.field = "Starbucks";
		
		//A클래스 메소드 접근 가능
		this.method(); 
	}
}
