package LJHIC_Exercise;
import java.util.Scanner;
public class ex1 {

public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
		int sum = 0;
		int num = scan.nextInt();
		double score = scan.nextDouble();
		double[] abc = new double[num];
		int aaa = (int)score;
		
		for(int i=0;i<num;i++) {
			abc[i] = (int)score / Math.pow(10,i);
			aaa= (int)score/10;
			
			
			sum += abc[i];
			System.out.println("abc["+i+"] = " + aaa);
		}
		System.out.println(sum);
		
	}

}