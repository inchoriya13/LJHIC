package LJHIC_Chapter06;

public class CH6_06_CalculatorExample {

	public static void main(String[] args) {
		// Calculator 객체 생성
		// powerOn 메소드 호출
		// plus 메소드 호출(매개 값은 알아서..) 및 호출 결과 출력
		// divide 메소드 호출(매개 값은 알아서..) 및 호출 결과 출력
		// powerOff 메소드 호출
		
		Ch6_06_Calculator Calc = new Ch6_06_Calculator(); // myCal 객체 생성
		
		Calc.powerOn(); // powerOn()메소드 호출
		
		Calc.plus(10, 5); // plus(int x , int y)메소드 호출
		System.out.println("plus(10, 5) = " + Calc.plus(10, 5));
		
		int x = 10;
		int y = 3;
		double result1 = Calc.divide(x,y);	 // divide(int x , int y)메소드 호출
		System.out.println("divide(int x, int y) = " + result1);
		
		Calc.powerOff();

	}

}
