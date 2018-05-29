package LJHIC_Chapter05;

import java.util.Scanner;

public class CH5_09_ArrayExample2 {

	public static void main(String[] args) {
		/*
		 * 문제
		 * 양수 5개를 입력 받아서 배열에 저장하고
		 * 입력 받은 수 중 가장 큰 수를 출력하는 프로그램을 작성하시오.
		 */
		
		int[] intArr = new int[5];
		int max = 0;
		
		System.out.println("양수 5개를 입력하세요 >> ");
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<intArr.length;i++) {
			intArr[i]= scan.nextInt();
			max = (max > intArr[i]) ? max : intArr[i];
	
		}
		
		System.out.println("MAX = " + max);

		scan.close();

	}

}
