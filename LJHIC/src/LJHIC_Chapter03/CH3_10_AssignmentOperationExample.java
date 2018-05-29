package LJHIC_Chapter03;
// 대입연산자
/*
 * += , -= , *= , /= , %=
 * A+=B → A=A+B
 * num1 = num1 + num2
 */
public class CH3_10_AssignmentOperationExample {

	public static void main(String[] args) {
		int result = 0;
		result += 10; // result=result+10
		System.out.println("result = " + result);//10
		
		result -= 5;	// result=result-5
		System.out.println("result = " + result);//5
		
		result *= 3;	// result=result*3
		System.out.println("result = " + result);//15
		
		result /= 5;	// result=result/5
		System.out.println("result = " + result);//3
		
		result %= 3;	// result=result%3
		System.out.println("result = " + result); //0
		

	}

}
