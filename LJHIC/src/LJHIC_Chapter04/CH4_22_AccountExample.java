package LJHIC_Chapter04;

import java.util.Scanner;

public class CH4_22_AccountExample {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int balance=0;
		int deposit=0;
		int withdraw=0;
		int sel =0;
		
		while(true) {
			
		System.out.println("----------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("----------------------------");
		System.out.print("선택 > ");
		sel = scan.nextInt();
		
		if(sel == 1) {
			System.out.print("예금액 : " );
			deposit = scan.nextInt();
			balance+=deposit;
			System.out.println("현재 잔액은 "+balance+"원 입니다.\n");
		} else if(sel == 2) {
			System.out.print("출금액 : " );
			withdraw = scan.nextInt();
					
			if(balance-withdraw>=0) {
				balance-=withdraw;
				System.out.println("현재 잔액은 "+balance+"원 입니다.\n");
			}else if(balance-withdraw<0){
				System.out.println("잔고가 부족합니다.\n현재 잔액은 "+balance+"원 입니다.");
			}
		} else if(sel == 3) {
				System.out.println("현재 잔액은 "+balance+"원 입니다.\n");
		} else if(sel == 4) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		
		}
			
	scan.close();	
	}

}
