package LJHIC_Chapter04;

import java.util.Scanner;

public class CH4_05_IfNestedExample {

	public static void main(String[] args) {
		/*
		 * 점수를 입력받고
		 * 
		 * 90점 이상인 점수에 대해서 95점 이상이면 A+
		 * 90이상 95미만이면 A
		 * 85~89 B+
		 * 80~84 B
		 * 75~79 C+
		 * 70~74 C
		 * 65~69 D+
		 * 60~64 D
		 * 60미만 F
		 * if문이 끝나면 학점을 출력하는 print문 사용
		 * 주의할 점은 학점 값을 처리하는 String 타입의 변수를 하나 사용
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 점수를 입력해주세요 : ");
		int score = scan.nextInt();
		String grade=null;
		
		
		if(score>=90) {
			grade = "A";
			if(score>=95) {
				grade="A+";
			}
			
		} else if(score>=80) {
			grade="B";
			if(score>=85) {
				grade="B+";
			}
			
		} else if(score>=70) {
			grade="C";
			if(score>=75) {
				grade="C+";
			}
			
		} else if(score>=60) {
			grade="D";
			if(score>=65) {
				grade="D+";
			}
			
		} else {
			grade = "F";
		}
		
		System.out.println("당신의 점수는 " + score + "점이고, 학점은 "+ grade +"입니다.");
		
		scan.close();
	}
	
}
