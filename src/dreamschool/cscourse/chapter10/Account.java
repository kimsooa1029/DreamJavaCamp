package dreamschool.cscourse.chapter10;

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
	
	@Override
	public String toString() {
		String str = "";
		str += "°èÁÂ¹øÈ£ :" + this.number +"\n";
		str += "¿¹±İÁÖ :" + name + "\n";
		str += "ÀÜ¾× :" + balance;
		
		return str;
	
	}
}
