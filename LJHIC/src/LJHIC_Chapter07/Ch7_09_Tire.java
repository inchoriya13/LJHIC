package LJHIC_Chapter07;

public class Ch7_09_Tire {
	//필드 선언
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	//생성자 선언
	public Ch7_09_Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드 : 필드값에 따른 메소드 정의 → roll()은 accumulatedRotation<maxRotation 일때 true의 값을 , 아닐시 false의 값을 반환
	public boolean roll() {
		//accumulatedRotation=0 (int로 선언시 초기값은 0)
		++accumulatedRotation; //누적 회전수 1증가
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " Tire 수명: " +(maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
		
	}
	
}//class
