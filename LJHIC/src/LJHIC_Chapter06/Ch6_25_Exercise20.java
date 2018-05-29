package LJHIC_Chapter06;
//Account 클래스
public class Ch6_25_Exercise20 {
	private String ano;	//계좌번호를 위한 필드
	private String owner;	//예금주를 위한 필드
	private int balance;	//잔액을 위한 필드
	//private : 자신의 클래스를 제외한 접근을 제한한다.
	
	//생성자 언급 없을 시 기본 생성자 생성
	//생성자 선언
	public Ch6_25_Exercise20(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//getter, setter 메소드 선언
	//필드값을 변형시키지 않기 위해 사용
	//setter : 필드값 저장
	//getter : 필드값을 불러올때 return문 존재 , 리턴타입과 메소드타입이 같아야 함 
	public String getAno() { 
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
