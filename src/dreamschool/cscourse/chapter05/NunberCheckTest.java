package dreamschool.cscourse.chapter05;

public class NunberCheckTest {

	public static void main(String[] args) {
        
		int num1 = 2 * 3;
		if (num1 < 0 ) {
		    System.out.println("음수는 확인하지 않습니다."); 
		}else if (num1 < 10) {
		    System.out.println("2 * 3 : 한 자리 수입니다.");
		}else if (num1 < 100) {
		    System.out.println("두 자리 수입니다.");
	    }else {
		    System.out.println("세 자리 수 이상입니다.");
        }
		
		int num2 = 4 * 5;
	    if (num2 < 0 ) {
		    System.out.println("음수는 확인하지 않습니다."); 
		}else if (num2 < 10) {
			System.out.println("한 자리 수입니다.");
		}else if (num2 < 100) {
			System.out.println("4 * 5 : 두 자리 수입니다.");
		}else {
			System.out.println("세 자리 수 이상입니다.");
	    }

    }
}
