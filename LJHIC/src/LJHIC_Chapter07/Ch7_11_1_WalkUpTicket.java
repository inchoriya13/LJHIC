package LJHIC_Chapter07;

public class Ch7_11_1_WalkUpTicket extends Ch7_11_1_Ticket {
	private boolean payByCredit;
	
	public Ch7_11_1_WalkUpTicket(int number, boolean payByCredit) {
		super(number);
		this.payByCredit = payByCredit;
	
	}
	


	public double getPrice() {
		if(payByCredit) {
			return price * 1.05;
		}
		return price;
	}
}
