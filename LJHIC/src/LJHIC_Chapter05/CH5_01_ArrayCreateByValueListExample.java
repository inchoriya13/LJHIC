package LJHIC_Chapter05;
//배열 선언 예제 p.152
import java.util.Scanner;
public class CH5_01_ArrayCreateByValueListExample {

	public static void main(String[] args) {
		// 배열 선언 : int 타입의 scores라는 배열 변수 선언
		// int[] scores;
		int[] scores= {83,90,87};
		
	
		
		//배열 값 접근(출력)
		System.out.println("scores[0]의 값 : " +scores[0]);
		System.out.println("scores[1]의 값 : " +scores[1]);
		System.out.println("scores[2]의 값 : " +scores[2]);
		
		//배열 길이
		int length = scores.length;
		System.out.println("배열길이 length 변수 값 : " + length);
		
		//배열 요소들의 합 구하기
		int sum = 0;
		for(int i =0;i<scores.length;i++) {
			sum += scores[i];
		}
		System.out.println("총합 : "+ sum);
		double avg = (double)sum / scores.length;
		System.out.println("평균 : "+ avg);
		System.out.println("");
		System.out.println("입력받을 숫자의 갯수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		
		int i =0;
		int sum1 = 0;
		int count = scan.nextInt();
		int[] arr1 = new int[count];
		for(i=0;i<count;i++) {
			arr1[i]= scan.nextInt();
			System.out.println("arr1[" + i +"] : " + arr1[i]);
			sum1 += arr1[i];
		}
		System.out.println("sum = " + sum1);
		System.out.println("avg = " + ((double)sum1)/count);
		
	scan.close();	
	}

}
