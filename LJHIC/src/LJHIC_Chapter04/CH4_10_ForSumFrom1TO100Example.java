package LJHIC_Chapter04;
//for문을 이용하여 1부터 100까지 더하기
public class CH4_10_ForSumFrom1TO100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i =0;
		
		for(i=0;i<=100;i++) {
			sum += i;
		}
		System.out.println("1부터 "+ (i-1) + "까지의 합 : " + sum);

	}

}
