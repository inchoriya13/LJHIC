package LJHIC_Chapter05;
import java.util.Scanner;
public class CH5_10_ArrayExample3 {

	public static void main(String[] args) {
		/*
		 * 문제
		 * 정수 5개를 입력받아 내림차순으로 정령하시오.
		 */
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int temp;
		System.out.println("정수 5개를 입력하세요 >> ");
		
		for(int i=0;i<num.length;i++) {
			num[i]=scan.nextInt();
		}
		//내림차순 정렬을 위한 처리 부분
		for(int j=0; j<num.length; j++) {
			for(int k=0; k<num.length; k++) {
				if(num[j]>num[k]) {
					temp = num[j];
					num[j] = num[k];
					num[k] = temp;
				}
			}
		}
		for(int n=0; n<num.length; n++) {
		System.out.print(num[n]+" ");
		}
		scan.close();
	}

}
