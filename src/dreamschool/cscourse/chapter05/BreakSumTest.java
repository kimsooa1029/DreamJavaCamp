package dreamschool.cscourse.chapter05;

public class BreakSumTest {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i<= 10; i++) {
			if(sum >= 30) {
				break;
			}
			sum =+ i;
		}
        System.out.println("합계결과 :" + sum);
	}

}
