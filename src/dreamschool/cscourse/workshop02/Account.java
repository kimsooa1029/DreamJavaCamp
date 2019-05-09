package dreamschool.cscourse.workshop02;

public class Account {
    
    private String account;
    private int    balance;
    private double interestRate;
    
    
    public Account( String account, int balance, double interestRate ) {
        this.account = account;//계좌
        this.balance = balance;//입금액
        this.interestRate = interestRate;//이자
    }
   
    public int calculateInterest() {
        int interest = 0;
        interest = (int)(balance * this.interestRate / 100);
    	balance += interest;
    	
        return interest;
    }
    
    public void deposit( int money ) {
    	this.balance += money;
    	System.out.println(this.balance);
    	
    }
    public void withdraw( int money ) {
        if (money > this.balance) {
        	System.out.println("[에러] 잔액이 모자릅니다.");
        }else {
        	this.balance -= money;
        }
    }

    public void printAccountInfo() {
        System.out.print( "계좌 정보 : " + this.account );
        System.out.print( ", 잔액 : " + this.balance );
        System.out.println( "원, 이자율 : " + this.interestRate + "%" );
    }
}