package LJHIC_Chapter06;
//static 필드, 메소드 사용
public class CH6_11_CalculatorExample4 {

	public static void main(String[] args) {
		double result1 = 10*10*Ch6_11_Calculator.pi;
		
		int result2 = Ch6_11_Calculator.plus(10, 10);
		int result3 = Ch6_11_Calculator.minus(11, 10);		
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}

}
