package dreamschool.cscourse.chapter09;

public class Account {
	private String number;
	private String name;
	private int balance;
	
	public Account(String number, String name, int balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void openAccount() {
		System.out.println("계좌를 개설합니다.");
		System.out.println("계좌번호 :" + this.number);
		System.out.println("예금주 :" + this.name);
		System.out.println("잔액 :" + this.balance);
		
	}
	

}
