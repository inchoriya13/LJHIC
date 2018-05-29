package LJHIC_Chapter04;

import java.util.Scanner;

public class CH4_Ex2 {
	
	public static void main(String[] args) {
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
	
		
		Scanner scan = new Scanner(System.in);
		
		double sum = 0, num=0;
		int i =0;
		
		 while(true) {
			 num = scan.nextInt();
			 sum +=num;
			 i++;
			 if(num==0) {
				 break;
			 }
			 
		 }System.out.println("수의 개수는 "+(i-1)+"개 이며 평균은"+(sum/(i-1))+"입니다.");
	scan.close();
	}
	
}