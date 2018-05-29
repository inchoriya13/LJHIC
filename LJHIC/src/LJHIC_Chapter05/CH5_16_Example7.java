package LJHIC_Chapter05;
import java.util.Scanner;
public class CH5_16_Example7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sel=0;
		int num=0;
		int i=0;
		int[] score = null;
		boolean run = true;

		
		while(run) {
			
			System.out.println("------------------------------------------------");
			System.out.println("| 1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 |");
			System.out.println("------------------------------------------------");
			System.out.print("선택 > ");
			sel = scan.nextInt();
			
			
			if(sel == 1) {
				System.out.print("학생수 > " );
				num = scan.nextInt();
				score = new int[num];
								
			} else if(sel == 2) {
				for(i=0;i<score.length;i++) {
					System.out.print((i+1) + "번 째 학생점수 : ");
					score[i]=scan.nextInt();
				}
	
			} else if(sel == 3) {
				for(i=0;i<score.length;i++) {
					System.out.println((i+1) + "번 째 학생점수 : "+score[i]);
				}
				
			} else if(sel == 4) {
				int sum=0;
				int max=0;
				int min=score[0];
				for(i=0;i<score.length;i++) {
					sum += score[i];
					max = (max > score[i]) ? max : score[i];
					min = (min < score[i]) ? min : score[i];
				}
				System.out.println("최고점수 : " + max);
				System.out.println("최저점수 : " + min);
				System.out.println("평균점수 : " + (double)sum/num);
				
			} else if(sel == 5) {
				run = false;
				System.out.println("프로그램을 종료합니다.");
			}
			
		}scan.close();
	}
}
