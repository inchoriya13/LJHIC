package LJHIC_Chapter06;
//import LJHIC_Chapter06.Ch6_15_A;
//패키지가 다를 경우 자동으로 선언 됨
public class Ch6_15_B {
	//같은 패키지에 있는 A클래스에서 선언한 생성자로 접근이 가능한지 확인
	Ch6_15_A a1 = new Ch6_15_A(true);
	Ch6_15_A a2 = new Ch6_15_A(1);
	//Ch6_15_A a3 = new Ch6_15_A("문자열");
}