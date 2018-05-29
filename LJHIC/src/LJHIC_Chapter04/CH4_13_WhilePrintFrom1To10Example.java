package LJHIC_Chapter04;

public class CH4_13_WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while(i<=100) {
			//while 문의 조건식을 만족하는 동안 실행됨.
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
