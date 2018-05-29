package LJHIC_Chapter06;
import java.util.Scanner;
public class Ch6_23_Distance {
		Scanner scan = new Scanner(System.in);
	
		void sideDistance(int x1, int y1, int x2, int y2) {
			System.out.println("두 점을 (x,y)순으로 입력해주세요.");
			System.out.print("첫번째 x좌표 ");
			x1 = scan.nextInt();
			System.out.print("첫번째 y좌표 ");
			y1 = scan.nextInt();
			System.out.print("두번째 x좌표 ");
			x2 = scan.nextInt();
			System.out.print("두번째 y좌표 ");
			y2 = scan.nextInt();
		double side = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2, 2));
	
		System.out.println("두 점 사이의 거리는 " + side);
		System.out.println("-----------------------------");
		return;
	}	
	
	int sqrt(int z) {
		System.out.print("정수를 입력해주세요 : ");
		z = scan.nextInt();
		
		int nSqrt = (int) Math.sqrt(Math.pow(z, 2));
		System.out.println("입력하신 정수"+z+"의 절대값은 " + nSqrt + " 입니다.");
		System.out.println("-----------------------------");
		
		return z;
	}
	
}
