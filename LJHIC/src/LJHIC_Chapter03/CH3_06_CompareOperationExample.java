package LJHIC_Chapter03;

public class CH3_06_CompareOperationExample {

		public static void main(String[] args) {
			/*
			 * 비교연산자 종류
			 * 비교연산자는 연산결과가 무조건 true, false로 나옴
			 * == : 양변이 같으면 결과는 true , 다르면 false
			 * != : 양변이 다르면 결과는 true , 같으면 true
			 * > , >= , < , <=
			 * 5 > 3 :  true 
			 */
			
			int num1 = 10;
			int num2 = 10;
			boolean result1 = (num1 == num2); 	//num1과 num2를 비교해서 같은가?
			boolean result2 = (num1 != num2);	//num1과 num2를 비교해서 다른가?
			boolean result3 = (num1 <= num2);	//num1보다 num2가 크거나 같은가?
			System.out.println("result1 = " + result1);
			System.out.println("result2 = " + result2);
			System.out.println("result3 = " + result3);
			char char1 = 'a';	// A = 65 , a = 97
			char char2 = 'B';	// B = 66
			boolean result4 = (char1 < char2);
			System.out.println("result4 = " + result4);
		}
}
