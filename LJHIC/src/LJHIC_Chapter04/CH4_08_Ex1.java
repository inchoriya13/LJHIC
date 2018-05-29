package LJHIC_Chapter04;

import java.util.Scanner;

public class CH4_08_Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학년을 입력하세요 : ");
		int grade = scan.nextInt();
		System.out.println("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		if(grade>=4) {
			if(score>=70) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		} else {
			if(score>=60) {
				System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		}
		scan.close();
	}

}
