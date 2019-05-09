package dreamschool.cscourse.chapter10;

public class FundAccount extends Account{
	private double earningRate;
	private int principal;		
	
	public FundAccount(String number, String name, int balance,
			double earningRate) {
		super(number, name, balance);
		this.earningRate = earningRate;
		this.principal = balance;
	}
	
	
	public double getEarningRate() {
		return earningRate;
	}
	public void setEarningRate(double earningRate) {
		this.earningRate = earningRate;
	}
	
	
	public void earnMoney() {
		this.setBalance(this.getBalance() +
				(int)(this.getBalance() * this.earningRate / 100));
	}
	@Override
	public String toString() {
		String str = "";
		str += "계좌번호 :" + this.getNumber() +"\n";
		str += "예금주 :" + this.getName() + "\n";
		str += "잔액 :" + this.getBalance() + "\n";
		str += "수익율 :" + this.earningRate + " (" + this.principal + "원)";
		return str;
	

	}}
