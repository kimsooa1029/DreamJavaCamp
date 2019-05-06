package dreamschool.cscourse.chapter04;

public class GradeTest {

	public static void main(String[] args) {
		int score = 75;
		System.out.println("A학점 :" + (score >=90 && score <= 100));
		System.out.println("B학점 :" + (score >=80 && score <= 90));
		System.out.println("C학점 :" + (score >=70 && score <= 80));
		System.out.println("D학점 :" + (score >=60 && score <= 70));
		
		System.out.println(score);

	}

}
