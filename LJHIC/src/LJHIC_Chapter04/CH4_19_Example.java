package LJHIC_Chapter04;

public class CH4_19_Example {

	public static void main(String[] args) {
		/*
		 * 문제 1+(-2)+3+(-4)+5+(-6)... 형태로 더했을때 
		 * 얼마까지 더해야 총합이 100이상 되는지 구해보시오
		 */
		int sum = 0;
		int num =1;
		int count = 1;
		int s =1;
		
		while(sum<=10) {
									
			num = s*count;
			sum += num;
			s=-s;	//부호변경(num을 -1로 선언해도 무방)
			count++;	//숫자적 순차 증가를 위한 증감연산자
			
			
		}
		System.out.println("총합이 100이상 되는 값 "+count);
		System.out.println(sum);
//		
	
	}

}
