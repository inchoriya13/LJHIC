package LJHIC_Chapter07;
	// (1)각 티켓은 티켓 번호와 가격 정보를 가지고 있음
	// (2)티켓의 가격은 변경 가능함
public class Ch7_11_Ticket {
	//필드 선언
	public int tnum;
	public int price;
	
	//생성자
	public Ch7_11_Ticket(int tnum, int price) {
		this.tnum = tnum;
		this.price = price;
	}

}
