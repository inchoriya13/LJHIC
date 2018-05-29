package LJHIC_Chapter06;

public class CH6_02_CarExample {

	public static void main(String[] args) {
		// Car 클래스 객체 선언
		Ch6_02_Car myCar = new Ch6_02_Car();
		
		System.out.println("제조회사(company) : " + myCar.company);
		System.out.println("모델명(model) : " + myCar.model);
		System.out.println("색상(color) : " + myCar.color);
		System.out.println("최고속도(maxSpeed) : " + myCar.maxSpeed);
		System.out.println("현재속도(speed) : " + myCar.speed);
	
		//필드값 변경
		myCar.speed = 70;
		System.out.println("수정된 속도 : " + myCar.speed);
	}

}