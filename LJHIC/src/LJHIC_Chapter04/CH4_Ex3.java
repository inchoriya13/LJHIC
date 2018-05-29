package LJHIC_Chapter04;
import java.util.Scanner;
public class CH4_Ex3 {

	public static void main(String[] args) {
		/*
		 * 1부터 입력받은 수까지의 정수 중에서
		 * 2또는 3의 배수가 아닌 수의 총합을 계산하시오
		 */
		Scanner scan = new Scanner(System.in);
		int sum=0;
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		
		
		System.out.print("2의 배수와 3의 배수를 제외한 값 : ");
		for(int i=1; i<=num; i++) {
			
			if(!(i%2==0 || i%3==0)) {
			sum += i;	
			System.out.print(i + " ");
			}
			
		}
		System.out.println("");
		System.out.println("2의 배수와 3의 배수를 제외한 수를 더한 값 " + sum);
		
		scan.close();
	}

}
