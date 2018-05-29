package LJHIC_Chapter04;

import java.util.Scanner;

public class CH4_21_UpDownExample {

	public static void main(String[] args) {
		/*
		 * 숫자맞추기 게임
		 * 
		 * 1. 1~범위까지의 난수 발생
		 * 2. 사용자가 숫자를 입력하도록 한다
		 * 3. 발생된 난수와 사용자가 입력한 숫자를 비교한다.
		 * 	(3.1) 입력한 숫자가 클 경우 "숫자가 큽니다" 출력하고 횟수 1회 증가
		 * 	(3.2) 입력한 숫자가 작을 경우 "숫자가 작습니다" 출력하고 횟수 1회 증가
		 * 	(3.3) 입력한 숫자가 맞을 경우 "정답입니다" 출력하고 횟수 1회 증가
		 * 3.4 시도횟수 출력
		 * 3.5 반복문 빠져나옴
		 */
		System.out.print("범위를 설정해주세요 : ");
		Scanner scan = new Scanner(System.in);
		int range = scan.nextInt();
		int num = (int)(Math.random()*range)+1;
		System.out.println("1부터 "+ range+ "까지 Up & Down Game!!");
		System.out.println("");
		int ans=0;
		int i=0;
		
		do {
			i++;
			System.out.println(">>>>>>>>");
			ans = scan.nextInt();
			if(range<ans) {
				System.out.println("범위를 벗어났습니다.");
			}else {
			if (num>ans) {
				System.out.println(ans+ " 보다 UP ↑↑↑");
			} else if (num<ans) {
				System.out.println(ans+ " 보다 DOWN ↓↓↓");
			} 
			}
		} while(!(num==ans));
		
		System.out.println("정답입니다.");
		System.out.println(i + "번째 성공했습니다.");
		
	scan.close();
	}
}