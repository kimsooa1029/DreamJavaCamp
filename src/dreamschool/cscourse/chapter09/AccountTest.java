package dreamschool.cscourse.chapter09;

public class AccountTest {
	public static void main(String[] args) {
		FundAccount fund1 = new FundAccount("111-2222", "홍길동", 5000000, 4.7);
		FundAccount fund2 = new FundAccount("111-3333", "홍길순", 1000000, 2.9);
	
		fund1.openAccount();
		System.out.println("수익이 발생했습니다.");
		
		System.out.println();
		fund2.openAccount();
		System.out.println("수익이 발생했습니다.");
		
		
	
	}
}