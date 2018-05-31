package LJHIC_Chapter07;

public class Ch7_11_1_TicketExample {

	public static void main(String[] args) {
		// 사전예약 티켓 또는 일반 티켓을 각각 객체로 만들어서 정보를 출력
		
		//사전예약 티켓 객체 생성(티켓번호 , 예약일수를 매개변수로 입력)
		Ch7_11_1_AdvancedTicket aTicket = new Ch7_11_1_AdvancedTicket(100,20);
		aTicket.setPrice(20000);
		System.out.println("당신의 사전예약 티켓 번호는 " + aTicket.getNumber() + "이고 구매가격은 " + aTicket.getPrice() + "원 입니다.");

		Ch7_11_1_WalkUpTicket wTicket = new Ch7_11_1_WalkUpTicket(200,true);
		wTicket.setPrice(20000);
		System.out.println("당신의 사전예약 티켓 번호는 " + wTicket.getNumber() + "이고 구매가격은 " + wTicket.getPrice() + "원 입니다.");
	}

}
