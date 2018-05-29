package LJHIC_Chapter06;
//CarExample2 클래스
public class CH6_03_CarExample2 {

	public static void main(String[] args) {
		//기본 생성자가 아닌 다른 생성자를 통해 객체 생성
		Ch6_03_Car myCar0 = new Ch6_03_Car(); //기본 생성자를 호출
		Ch6_03_Car myCar1 = new Ch6_03_Car("화이트", 3000);
		//String color = "화이트" , int cc=300으로 필드 초기화 하면서 객체 생성
		Ch6_03_Car myCar2 = new Ch6_03_Car("네이비", 2000);
		Ch6_03_Car myCar3 = new Ch6_03_Car("레드", 4500);
		//Ch6_03_Car myCar4 = new Ch6_03_Car(String, int); 타입으로 지정해줘야 한다.
		
		System.out.println(myCar0);
		System.out.println(myCar1);
		System.out.println(myCar2);
		System.out.println(myCar3);
		
	}

}
