package LJHIC_Chapter07;

public class CH7_03_ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		Ch7_03_Calculator cal = new Ch7_03_Calculator();
		System.out.println("부모클래스 메소드 호출  : " + cal.areaCircle(r));
		Ch7_03_Computer com = new Ch7_03_Computer();
		System.out.println("자식클래스 메소드 호출  : " + com.areaCircle(r));


	}

}
