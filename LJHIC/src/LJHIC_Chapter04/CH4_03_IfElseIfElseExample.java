package LJHIC_Chapter04;

import java.util.Scanner;

//if, else if, else if, ....., else
public class CH4_03_IfElseIfElseExample {

	public static void main(String[] args) {
		/*
		 * 점수를 스캔으로 입력 받아서
		 * 90이상이면 점수가 90~100입니다. 등급은 A입니다.
		 * 80이상 90미만이면 점수가 80~89입니다. 등급은 B입니다.
		 * 70이상 80미만이면 점수가 70~79입니다. 등급은 C입니다.
		 * 60이상 70미만이면 점수가 60~69입니다. 등급은 D입니다.
		 * 60미만이면 점수가 60미만입니다. 재수강고고 FFFFFFF.
		 */
		
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if(score>=90) {
			System.out.println("점수가 90~100 입니다.\n등급은 A입니다.");
			
		} else if(score>=80){		
			System.out.println("점수가 80~89입니다.\n등급은 B입니다.");
			
		} else if(score>=70) {		
			System.out.println("점수가 70~79입니다.\n등급은 C입니다.");
			
		} else if(score>=60) {		
			System.out.println("점수가 60~69입니다.\n등급은 D입니다.");
			
		} else {
			System.out.println("점수가 60미만입니다.\n재수강고고FFFF");
			
		}
		scan.close();
}
}
