package LJHIC_Chapter10;
import java.util.Scanner;
public class Ch10_05_Arithmetic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			while(true) {
			System.out.print("분자를 입력하세요 >> ");
			int num1 = scan.nextInt();
			System.out.print("분모를 입력하세요 >> ");
			int num2 = scan.nextInt();
		
			int result = num1/num2;
			System.out.println(num1+" / " + num2+" = " + result);
			}
		} catch(ArithmeticException e) {
			System.out.println("<예외발생 : ArithmeticException> 분모가 0입니다.");
			
		} finally {
			
		}

	}

}
