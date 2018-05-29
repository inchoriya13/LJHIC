package LJHIC_Chapter07;

/*
 * (1)Sedan, Truck에 대한 객체 각각 생성
 * (2)Sedan의 속도를 200, Truck의 속도를 100으로 올림
 * (3)Sedan의 좌석수를 5, Truck의 적재량을 5로 설정
 * (4)출력문
 *   - 빨간색 승용차의 속도는 200이고 좌석수는 5개 입니다.
 *   - 검정색 트럭의 속도는 100이고 적재량은 5톤 입니다.
 */

public class Ch7_10_CarExample {

	public static void main(String[] args) {
		
		//객체 생성
		//Ch7_10_Car car = new Ch7_10_Car();
		Ch7_10_Sedan sedan = new Ch7_10_Sedan("빨간색", 200,0);
		Ch7_10_Truck truck = new Ch7_10_Truck("검정색",100,0);
		
		sedan.speedDown(50);
		truck.speedUp(30);
		
		sedan.setSeat(5);
		truck.setLoadge(5);
		
		System.out.println(sedan.color + " 승용차의 속도는  " + sedan.speed + "km/h 이고 좌석수는 " + sedan.getSeat() + "개 입니다.");
		System.out.println(truck.color + " 트럭의 속도는  " + truck.speed + "km/h 이고 적재량은 " + truck.getLoadge() + "톤 입니다.");

	}

}
