package dreamschool.cscourse.chapter05;

public class GradeElseIfTest {

	public static void main(String[] args) {
		int score = 11;
		
		if (score > 100 || score < 0) {
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
		}else if(score >=90) {
			System.out.println("A�����Դϴ�.");
		}else if (score >=80) {
			System.out.println("B�����Դϴ�.");
		}else if (score >=70) {
			System.out.println("C�����Դϴ�.");
		}else if (score >=60) {
			System.out.println("D�����Դϴ�.");
		}else {
			System.out.println("F�����Դϴ�.");
		}

	}

}
