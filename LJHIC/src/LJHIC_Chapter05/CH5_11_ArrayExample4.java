package LJHIC_Chapter05;
import java.util.Scanner;
public class CH5_11_ArrayExample4 {

	public static void main(String[] args) {
		/*
		 * 거스름돈 문제
		 * 어뜬 금액을 입력하게 되면 각 동전이 몇개씩 필요한지 출력하는 문제
		 * 예를 들어
		 * 2680원이면
		 * 500원 : 5개
		 * 100원 : 1개
		 *  50원 : 1개
		 *  10원 : 3개 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("거스름돈을 입력하세요 >> ");
		int money = scan.nextInt();
		int arrMoney[] = {500,100,50,10} ;
		
		for(int i=0;i<arrMoney.length;i++) {
			int count = money/arrMoney[i];
			System.out.println(arrMoney[i]+"원 동전"+count+"개");
			
			money = money%arrMoney[i];
		}
		
		
		/*Scanner scan = new Scanner(System.in);
		System.out.print("거스름돈을 입력하세요 >> ");
		int money = scan.nextInt();
		int arrMoney[] = {500,100,50,10} ;
		
		int h5 = money / arrMoney[0];
		int h1 = (money%500)/arrMoney[1];
		int t5 = (money%500)%100/arrMoney[2];
		int t1 = (money%500)%100%50/arrMoney[3];
		
		System.out.println(money + "원은\n"+arrMoney[0]+"원 : "+h5+"개\n"+arrMoney[1]+"원 : "+h1+"개\n"+arrMoney[2]+"원 : " +t5+"개\n"+arrMoney[0]+"원 : " +t1+"개");*/
		scan.close();
	}

}
