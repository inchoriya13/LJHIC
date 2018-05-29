package LJHIC_Chapter07;
//자동타입변환 예제(자식클래스타입->부모클래스타입)

//A클래스선언
class A {
	
}
//부모가 A클래스인 자식클래스 B클래스 선언
class B extends A {
	
}

//부모가 A클래스인 자식클래스 C클래스 선언
class C extends A {
	
}

//부모가 B클래스인 자식클래스 D클래스 선언
class D extends B {
	
}

//부모가 C클래스인 자식클래스 E클래스 선언
class E extends C {
	
}

public class Ch7_08_PromotionExample {
	public static void main(String[] args) {
		//B클래스 타입의 변수 b선언
		B b = new B();
		
		//C클래스 타입의 변수 c선언
		C c = new C();
		
		//D클래스 타입의 변수 d선언
		D d = new D();
		
		//E클래스 타입의 변수 e선언
		E e = new E();
		
		//각각 선언한 변수들에 대한 자동 형변환 여부 확인
		
		//A클래스 타입의 변수(a1)에 B클래스 타입 변수 b대입
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//B b2 = e; //변수 e는 E클래스의 변수로 B클래스와 아무런 상속관계가 없다
		//C c2 = d; //변수 d는 D클래스의 변수로 C클래스와 아무런 상속관계가 없다
	}
	
}
