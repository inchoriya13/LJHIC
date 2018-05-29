package LJHIC_Chapter06;

public class Ch6_24_Account {
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	private int balance = 0;
	
	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE  && balance <= MAX_BALANCE) {
			this.balance = balance;
		} else {
			return;
		}
	}
	
	public int getBalance() {
		return balance;
	}
}
