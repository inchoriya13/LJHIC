package LJHIC_Chapter07;

public class Ch7_13_InstanceofExample {

	// method1의 매개변수 : Parent클래스 타입의 변수 parent
	public static void method1(Ch7_13_Parent parent) {
		//parent 변수가 Child 클래스 타입 여부를 알아본다
		if(parent instanceof Ch7_13_Child) {
			// parent 변수를 Child 클래스 타입으로 강제형변환해서
			// Child 클래스 타입의 변수 child에 대입한다.
			Ch7_13_Child child =(Ch7_13_Child)parent;
			System.out.println("method1 - child로 변환 성공");
		} else {
			System.out.println("method1 - child로 변환되지 않음");
		}
	}
	
	// method2 : 강제 형변환이 가능한지 여부를 묻지 않고 강제 형변환 수행하는 메소드
	public static void method2(Ch7_13_Parent parent) {
		Ch7_13_Child child = (Ch7_13_Child) parent;
		System.out.println("method2 - child로 변환 성공");
	}
	
	
	public static void main(String[] args) {
		/*
		 *  객체 타입 확인을 위한 instanceof 연산자
		 *  강제타입변환이 가능하지 여부를 판단하기 위해 사용하는 연산자
		 */
		
		/*
		 *  Parent 타입의 변수를 선언해서 Child 객체를 대입
		 *  method1, 2를 각각 호출
		 *  
		 *  Parent 타입의 변수를 선언해서 Parent 객체를 대입
		 *  method1, 2를 각각 호출
		 */
		
		Ch7_13_Parent parent1 = new Ch7_13_Child();
			
		method1(parent1); //성공
		method2(parent1); //성공
		
		Ch7_13_Parent parent2 = new Ch7_13_Parent();
		
		method1(parent2); //오류는 없지만 변환은 안됨.
		//method2(parent2); //오류

	}

}
