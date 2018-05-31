package LJHIC_Chapter07;

public class Ch7_11_1_Ticket {
	private int number; //티켓번호
	protected double price; //티켓가격
	
	//생성자
	public Ch7_11_1_Ticket(int number) {
		this.number = number;
	}
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
