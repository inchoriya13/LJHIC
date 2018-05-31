package LJHIC_Chapter07;
	
  // (1)사전예약 티켓, 티켓 번호와 사전예약 일수 정보를 가지고 있음
  // (2)언제 예매를 했느냐에 따라 가격이 달라짐
  //    - 30일전 : 50% 할인
  //    - 10일전 : 20% 할인
  //    -  5일전 : 10% 할인
	 
public class Ch7_11_AdvancedTicket extends Ch7_11_Ticket{
	//필드 선언
	public int dat;
	
	//생성자 선언
	public Ch7_11_AdvancedTicket(int tnum, int price, int dat) {
		super(tnum, price);
		this.dat = dat;
	}
	
	//할인율 메소드 선언
	public int getSale() {
		return price;
	}
	
	public void setSale(int dat) {
		this.dat = dat;
		if(dat>=30) {
			this.price = (int) (this.price * (0.5));
			
		} else if(dat>=10) {
			this.price = (int) (this.price * (0.8));
			
		} else if (dat>=5) {
			this.price = (int) (this.price * (0.9));
			
		}
	}

		
	}


