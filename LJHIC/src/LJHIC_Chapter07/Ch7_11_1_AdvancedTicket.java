package LJHIC_Chapter07;

public class Ch7_11_1_AdvancedTicket extends Ch7_11_1_Ticket{
	private int advancedDays; //사전예약 일수
	
	public Ch7_11_1_AdvancedTicket(int number, int advancedDays) {
		super(number);
		this.advancedDays = advancedDays;
	}
	
	//입장권의 가격을 처리하기 위한 메소드
	public double getPrice() {
		if(advancedDays >= 30) {
			price = price * 0.5;
		} else if (advancedDays >= 10) {
			price = price * 0.8; 
		} else if (advancedDays >= 5) {
			price = price * 0.9;
		}
		return price;
	}
}
