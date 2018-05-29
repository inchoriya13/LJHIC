package LJHIC_Chapter04;

import java.util.Scanner;

public class CH4_20_example {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int y = 0;
		System.out.println("2x + 4y = ");
		int ans = scan.nextInt();
		
		if((ans-4*y)%2==0) {
			for(y=ans/4;y>=0;y--) {
				x = (ans-y*4)/2;
				System.out.println("x = "+x+" 일때("+ 2*x +")\ty = "+ y + "일때(" + 4*y + ")");
			} 
		}else {
			System.out.println("해가 존재하지 않습니다.");
		}
		scan.close();
	}

}
