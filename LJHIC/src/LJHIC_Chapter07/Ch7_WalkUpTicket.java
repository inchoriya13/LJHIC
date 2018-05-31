package LJHIC_Chapter07;
	
// (1)일반 티켓 : 티켓이 발행될 때 티켓번호와 신용카드 결제 여부 정보를 가지고 있음
// (2)신용카드로 결제하는 경우 5% 금액이 가산됨 
	 
public class Ch7_WalkUpTicket extends Ch7_11_Ticket{
	//필드 선언
	public String credit;
	
	public Ch7_WalkUpTicket(int tnum, int price, String credit) {
		super(tnum,price);
		this.credit = credit;
	}
	public void payment(String credit) {
		if(credit.equals("y")||credit.equals("Y")) {
			this.price = (int) (this.price *1.05);
			this.credit = "신용카드결제";
		} else if(credit.equals("n")||credit.equals("N")) {
			this.credit = "현금결제";
		}
		
	}
		



	
}
