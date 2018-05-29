package LJHIC_Chapter05;

import java.util.Scanner;

public class CH5_08_ArrayExample1 {

	public static void main(String[] args) {
		
		System.out.print("입력받을 숫자의 갯수를 입력하세요 >> ");
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int sum = 0;
		int[] arr1 = new int[count];
		for(int i=0;i<count;i++) {
			arr1[i]= scan.nextInt();
			sum += arr1[i];
		}
		for(int i=0;i<count;i++) {
			System.out.println("arr1[" + i +"] : " + arr1[i]);
		}
		double e = ((double)sum)/arr1.length;
		double n = Math.pow(10.0, 3);
		System.out.println("sum = " + sum);
		System.out.println("avg = " + e);
		
		System.out.println("avg(소숫점 셋째자리에서 반올림) = " + Math.round(e*n)/n);
		scan.close();
	}

}
