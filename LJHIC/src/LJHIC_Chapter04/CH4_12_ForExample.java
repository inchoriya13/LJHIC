package LJHIC_Chapter04;

import java.util.Scanner;

public class CH4_12_ForExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int i=0;		
		System.out.print("시작할 숫자를 입력하세요 : ");
		int num=scan.nextInt();
		System.out.print("마지막 숫자를 입력하세요 : ");
		int num1=scan.nextInt();
		System.out.print("결과값 : ");
		for(i=num;i<=num1;i++) {
			sum+=i;
			System.out.print(i);
			
			if(i<=(num1-1)) {
				System.out.print(" + ");
			}else {
				System.out.print(" = " + sum);
			}
		}scan.close();
	}

}
