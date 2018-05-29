package LJHIC_Chapter06;
import java.util.Scanner;
public class CH6_23_DistanceMain {

	public static void main(String[] args) {
			
		Ch6_23_Distance dist = new Ch6_23_Distance();
		
		Scanner scan = new Scanner(System.in);
		int sel=0;
		boolean run = true;
		
			
		while(run) {
			
		System.out.println("수행할 서비스를 선택해 주세요.");
		System.out.println("1. 두점 사이의 거리 구하기\n2. 절대값 구하기\n3. 종료");
		System.out.print("선택 >> ");
		sel = scan.nextInt();
		
		switch(sel) {
		case(1):
						
			int x1=0, y1=0, x2=0, y2 =0;
			dist.sideDistance(x1, y1, x2, y2);
			break;
			
		case(2) :
			
			int z = 0;
			dist.sqrt(z);
			break;
		case(3) :
			System.out.println("프로그램을 종료합니다.");
			run = false;
			break;
		
			} //switch{}
		} //while{}
	}

}
