package dreamschool.cscourse.chapter05;

public class GradeElseIfTest {

	public static void main(String[] args) {
		int score = 11;
		
		if (score > 100 || score < 0) {
			System.out.println("점수를 잘못 입력하셨습니다.");
		}else if(score >=90) {
			System.out.println("A학점입니다.");
		}else if (score >=80) {
			System.out.println("B학점입니다.");
		}else if (score >=70) {
			System.out.println("C학점입니다.");
		}else if (score >=60) {
			System.out.println("D학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}

	}

}
