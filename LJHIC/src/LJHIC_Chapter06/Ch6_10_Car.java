package LJHIC_Chapter06;

public class Ch6_10_Car {
	//필드 선언
	String model;
	int speed;
	
	//생성자 선언
	//생성자의 이름은 클래스 이름과 동일하게 선언
	Ch6_10_Car(String model){ 
		//넘겨받은 매개변수 값을 현재 필드에 저장
		this.model = model;
	}
	
	//메소드 선언
	void run(){
		for(int i=10;i<=50;i+=10) {
			System.out.println(this.model + "가 달립니다.(시속:" + i + "km/h)");
		}
	}
}
