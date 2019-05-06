package dreamschool.cscourse.chapter04;

public class LogicaOperatorEx {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		
		boolean result1 = (num1 > num2) && (num1 > 5);
		boolean result2 = (num1 > num2) && (num1 == num2);
		boolean result3 = (num1 <= num2) || (num1 != num2);
		boolean result4 = (num1 <= num2) || (num1 > num2);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}

}
