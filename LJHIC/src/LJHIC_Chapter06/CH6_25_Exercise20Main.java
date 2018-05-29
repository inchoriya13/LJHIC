package LJHIC_Chapter06;
//BankApplication 클래스
import java.util.Scanner;
public class CH6_25_Exercise20Main {
	//account 클래스 타입의 accountArray 배열 선언
	private static Ch6_25_Exercise20[] accountArray = new Ch6_25_Exercise20[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {	
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5. 종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택 > ");
			
			int sel = scanner.nextInt();
			
			if(sel == 1) {
				createAccount();
			} else if (sel == 2) {
				accountList();
			} else if (sel == 3) {
				deposit();
			} else if (sel == 4) {
				withdraw();
			} else if (sel == 5) {
				run = false;
			}
		}//while()
		System.out.println("프로그램 종료");
			
	}//main
	
	// 계좌 생성을 위한 createAccount 메소드
	// 계좌번호, 계좌주, 초기입금액을 입력받고 계좌가 생성되었습니다. 출력
	// 입력이 끝나면 다시 선택하는 내용이 출력되어 추가로 계좌생성이 가능함.
	private static void createAccount() {
		System.out.println("----------------------");
		System.out.println("계좌생성");
		System.out.println("----------------------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next(); //계좌번호 입력을 위한 변수
		System.out.print("계좌주 : ");
		String owner = scanner.next();	//계좌주 입력을 위한 변수
		System.out.print("초기입금액 : ");
		int balance = scanner.nextInt(); //초기입금액 입력을 위한 변수
		
		//입력 받은 값을 이용하여 Account 클래스에 대한 객체 생성
		Ch6_25_Exercise20 ac = new Ch6_25_Exercise20(ano, owner, balance);
		//입력 받은 변수를 배열 변수에 하나씩 저장
		for (int i = 0; i<=accountArray.length; i++) {
			if(accountArray[i]==null) {
				accountArray[i] = ac;
				//ac.getAno(), ac.getOwner(), ac.getBalance()를 ac에, 그 후에 다시 accountArray[i]에..
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}//for
		
	}//createAccount
	
	//계좌목록을 보기 위한 메소드
	//입력된 고객의 계좌번호, 계좌주, 잔액을 모두 보여줌.
	private static void accountList() {
		System.out.println("----------------------");
		System.out.println("계좌생성");
		System.out.println("----------------------");
		for(int i=0; i<accountArray.length;i++) {
			//Account 클래스 타입의  account 변수를 선엄함.
			//accountArray 배열에 있는 내용을 담는다.
			Ch6_25_Exercise20 account = accountArray[i];
			if(account!=null) {
				System.out.print(account.getAno()+"\t");
				System.out.print(account.getOwner()+"\t");
				System.out.println(account.getBalance());
			}//if
		}//for
		
	}//accountList()
	
	//예금처리를 위한 메소드
	//입금하고자 하는 계좌의 계좌번호, 입금액을 입력받아서
	//계좌번호 일치여부를 판단하고 기존 잔액에 입금액을 더해서 잔액으로 만든다.
	private static void deposit() {
		System.out.println("----------------------");
		System.out.println("예금");
		System.out.println("----------------------");
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.print("입금액 : ");
		int money = scanner.nextInt();
		//Account 클래스 타입의 account 변수를 선언
		//우변의 내용 : findAccount 메소드를 호출하면서 매개변수는 ano로 넘김.
		Ch6_25_Exercise20 account = findAccount(ano);
		if(account==null) {
			System.out.println("계좌가 없습니다.");
			return;
		}
		int balance = account.getBalance() + money;
		account.setBalance(balance);
		//account.setBalance(account.getBalance()+money);
		System.out.println("예금이 성공되었습니다.");
		System.out.println("잔액은 " + account.getBalance() + "원 입니다.");
	}//deposit()
	
	//출금처리를 위한 메소드
	//출금하고자 하는 계좌의 계좌번호, 출금액을 입력받아서
	//계좌번호 일치여부를 판단하고 기존 잔액에 출금액을 빼서 잔액으로 만든다.
	private static void withdraw() {
		System.out.println("----------------------");
		System.out.println("출금");
		System.out.println("----------------------");
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.print("출금액 : ");
		int money = scanner.nextInt();
		//Account 클래스 타입의 account 변수를 선언
		//우변의 내용 : findAccount 메소드를 호출하면서 매개변수는 ano로 넘김.
		Ch6_25_Exercise20 account = findAccount(ano);
		if(account==null) {
			System.out.println("계좌가 없습니다.");
			return;
		}
		int balance = account.getBalance() - money;
		account.setBalance(balance);
		//account.setBalance(account.getBalance()-money);
		System.out.println("출금이 성공되었습니다.");
		System.out.println("잔액은 " + account.getBalance() + "원 입니다.");
	}//withdraw()
	
	//고객이 입력한 계좌번호와 저장되어 있는 계좌번호에 대해 일치여부를 판단하는 메소드
	//매개변수 ano
	//리턴타입 : Account클래스  → Ch6_25_Exercise20
	private static Ch6_25_Exercise20 findAccount(String ano){
		//Account클래스 타입의 변수 선언(처리가 끝난 후 리턴 값을 주기 위해)
		Ch6_25_Exercise20 account = null;
		//ano와 일치하는 계좌번호를 찾기 위해 배열의 모든 내용을 반복문을 통해 검색
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				/////////배열에 저장되어 있는 계좌번호를 임시로 저장하기 위한 변수 ////////////////
				String dbAno = accountArray[i].getAno(); 
				//검색된 계좌번호와 매개값으로 받은 ano가 일치하는지 판단
				if(dbAno.equals(ano)) {
					//일치하면 해당 인덱스에 있는 내용을 account 변수에 저장
					account = accountArray[i];
					break;
				}//if2
			}//if1
		}//for
		return account;
	}//findAccount(String ano)
	
}//class
