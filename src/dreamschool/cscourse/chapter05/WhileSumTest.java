package dreamschool.cscourse.chapter05;

public class WhileSumTest {

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		
		while(sum <= 50) {
			sum += count;
			if (sum >= 50) {
				break;
			}
			count++;
			
		}
		System.out.println("х╫╪Ж :" + count);
		System.out.println("гу╟Х :" + sum);

	}

}
