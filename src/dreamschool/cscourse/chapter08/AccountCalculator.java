package dreamschool.cscourse.chapter08;

public class AccountCalculator {
	

	private String accNum;//°èÁÂ¹øÈ£
	private int balance;//ÀÜ¾×
	private double interestRate;//ÀÌÀ²
	
	
	
	public AccountCalculator(String accNum, int balance, double interestRate) {
		this.accNum = accNum;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public int calculatorInterest() {
		int interest = (int)(this.balance * this.interestRate / 100);
		balance += interest;
		return interest;
	}
		
}