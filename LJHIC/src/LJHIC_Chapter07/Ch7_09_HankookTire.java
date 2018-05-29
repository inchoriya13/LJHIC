package LJHIC_Chapter07;

public class Ch7_09_HankookTire extends Ch7_09_Tire { //Tire클래스(부모클래스)로부터 상속받음
	//필드
	//생성자
	public Ch7_09_HankookTire(String location, int maxRotation) {
		super(location,maxRotation); // Tire클래스의 필드값을 상속받는다
	}
	
	//메소드 : 필드값에 따른 메소드 정의 → roll()은 accumulatedRotation<maxRotation 일때 true의 값을 , 아닐시 false의 값을 반환
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " HankookTire 수명: " +(maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}//roll()
}
