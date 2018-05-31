package LJHIC_Chapter07;

public class Ch7_16_CarExample {

	public static void main(String[] args) {
		Ch7_16_Sedan sedan = new Ch7_16_Sedan(200,"빨간색");
		Ch7_16_Truck truck = new Ch7_16_Truck(150, "파랑색");
		
		System.out.println(sedan.color + "승용차의 속도 : " + sedan.speed+"km/h");
		System.out.println(truck.color + "트럭의 속도 : " + truck.speed+"km/h");
		
		sedan.work();
		truck.work();
	}

}
