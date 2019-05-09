package dreamschool.cscourse.chapter08;

public class OddEvenIndexSumTest {

	public static void main(String[] args) {
		int [] numbers = {12, 53, 24, 10, 22, 38, 64, 39};
		int oddSum = 0;
		int evenSum = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(i % 2 == 0) {
				evenSum += numbers[i];
			}else {
				oddSum += numbers[i];
			}
		}
		System.out.println("배열 데이터");
		System.out.println("홀수 번째 정수의 합 :" + oddSum);
		System.out.println("짝수 번째 정수의 합 :" + evenSum);

	}

}
