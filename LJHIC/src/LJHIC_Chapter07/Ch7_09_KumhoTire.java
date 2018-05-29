package LJHIC_Chapter07;
//HankookTire클래스의 내용과 동일
public class Ch7_09_KumhoTire extends Ch7_09_Tire { //Tire클래스(부모클래스)로부터 상속받음
	//필드
	//생성자
	public Ch7_09_KumhoTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " KumhoTire 수명: " +(maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}//roll()
}
