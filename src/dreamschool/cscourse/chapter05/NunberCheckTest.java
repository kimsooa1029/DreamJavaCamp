package dreamschool.cscourse.chapter05;

public class NunberCheckTest {

	public static void main(String[] args) {
        
		int num1 = 2 * 3;
		if (num1 < 0 ) {
		    System.out.println("������ Ȯ������ �ʽ��ϴ�."); 
		}else if (num1 < 10) {
		    System.out.println("2 * 3 : �� �ڸ� ���Դϴ�.");
		}else if (num1 < 100) {
		    System.out.println("�� �ڸ� ���Դϴ�.");
	    }else {
		    System.out.println("�� �ڸ� �� �̻��Դϴ�.");
        }
		
		int num2 = 4 * 5;
	    if (num2 < 0 ) {
		    System.out.println("������ Ȯ������ �ʽ��ϴ�."); 
		}else if (num2 < 10) {
			System.out.println("�� �ڸ� ���Դϴ�.");
		}else if (num2 < 100) {
			System.out.println("4 * 5 : �� �ڸ� ���Դϴ�.");
		}else {
			System.out.println("�� �ڸ� �� �̻��Դϴ�.");
	    }

    }
}
