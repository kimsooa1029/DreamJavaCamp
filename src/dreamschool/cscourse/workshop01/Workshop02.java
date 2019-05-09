package dreamschool.cscourse.workshop01;

//문제 2.
//아래와 같이 변수가 선언되어 있을 때,
//백의 자리만 남기고 나머지 자리수는 0으로 바꾸는 프로그램을 완성하시오.
public class Workshop02 {
 
	public static void main( String[] args ) {
		int number = 456;
		// int result = (number / 100) * 100;
		int result = number - (number % 100);
		
		System.out.println(result);
     
     
 	}
}