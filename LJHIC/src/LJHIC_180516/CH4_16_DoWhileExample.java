package LJHIC_180516;

import java.util.Scanner;

public class CH4_16_DoWhileExample {

	public static void main(String[] args) {
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		String ent;
		
		do {
			System.out.print(">");
			ent = scan.nextLine();
			System.out.println(ent);
		} while( ! ent.equals("0") );
		
		System.out.println();
		System.out.println("프로그램 종료");
		
		scan.close();
	}

}
