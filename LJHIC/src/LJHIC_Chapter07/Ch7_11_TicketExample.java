package LJHIC_Chapter07;
import java.util.Scanner;
public class Ch7_11_TicketExample {
	//사전예약 티켓, 일반예매 티켓을 각각 객체로 만들어서 각각 티켓의 티켓번호, 구매가격을 출력하시오.
	public static void main(String[] args) {
		
		int price1 = 20000;
		
		Ch7_11_AdvancedTicket aTicket = new Ch7_11_AdvancedTicket(111,price1,24);
		Ch7_WalkUpTicket wTicket = new Ch7_WalkUpTicket(222,price1,"m");
		
		aTicket.setSale(40);
		wTicket.payment("n");
		
		System.out.println("----------------------------------------------------------");
		System.out.println("|사전예약 티켓 번호 : a" + aTicket.tnum + " | 예약날짜: " + aTicket.dat + "일 전\t| 티켓가격 : " + aTicket.price + "원|");
		System.out.println("----------------------------------------------------------");
		System.out.println("|일반예배 티켓 번호 : w" + wTicket.tnum + " | 결제수단: " + wTicket.credit + "\t| 티켓가격 : " + wTicket.price + "원|");
		System.out.println("----------------------------------------------------------");
	}

}
