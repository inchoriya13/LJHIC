package LJHIC_Chapter06;

public class Ch6_20_Exercise {
	//필드 선언
		private String name;
		private int number;
		private int balance;
		public int deposit;
		public int withdraw;
		
		
		public String getOwnerName() {
			return name;
		}


		public void setOwnerName(String name) {
			this.name = name;
		}


		public int getAccountNumber() {
			return number;
		}


		public void setAccountNumber(int number) {
			this.number = number;
		}


		public int getBalance() {
			return balance;
		}


		public void setBalance(int balance) {
			this.balance = balance;
		}


		public int deposit(int deposit) {
			this.balance = balance + deposit;
			return balance;
		}
		
		public int withdraw(int withdraw) {
			this.balance = balance - withdraw;
			return balance;
		}
		
		public void result() {
			System.out.println("예금주 이름 : " + this.name);
			System.out.println("계좌번호 : " + this.number);
			System.out.println("잔고 : " + this.balance);
			
		}
}
