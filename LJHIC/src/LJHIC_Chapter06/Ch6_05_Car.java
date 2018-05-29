package LJHIC_Chapter06;
// 생성자(Constructor) Overloading 예제
public class Ch6_05_Car {
	/*
	 * 여러종류의 생성자 선언해보기
	 * 1. 기본생성자
	 * 2. model을 매개변수로 하는 생성자
	 * 3. model, color를 매개변수로 하는 생성자
	 * 4. model, color, maxSpeed를 매개변수로 하는 생성자
	 */
	
	String company = "Audi";
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	Ch6_05_Car(){
		
	}
	
	Ch6_05_Car(String model){
		this(model,"white",180);
	}
	//현재 클래스에 있는 (String, String, int)형태의 생성자를 호출하여
	
	/*Ch6_05_Car(String m, String c){
		model = m;
		color = c;
	}*/
	
	/*Ch6_05_Car(String m, String c, int x ){
		model = m;
		color = c;
		maxSpeed = x;
	}*/

	
	Ch6_05_Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Ch6_05_Car(String model, String color, int maxSpeed ){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}	// myCar2
	
	Ch6_05_Car(String model, int maxSpeed, int speed){
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}	//myCar3
	
	/*Ch6_05_Car(String model, String color, int speed ){
		this.model = model;
		this.color = color;
		this.speed = speed;
	}	*/
	//타입이 중복되는 경우에는 생성자 오버로딩 불가
}