package dreamschool.cscourse.chapter05;

public class MultipleFiveSumTest {

	public static void main(String[] args) {
		int count = 1; 
		int sum = 0;
		
		while(sum < 100) {
			int mulFive = count * 5;
			if (sum >= 100) {
				break;
			}
			sum += mulFive;
			System.out.println(count + ". ( +" + mulFive + ") " + sum);
			count++;
			
		}

	}

}
