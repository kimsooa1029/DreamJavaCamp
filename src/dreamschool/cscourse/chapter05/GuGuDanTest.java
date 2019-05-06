package dreamschool.cscourse.chapter05;

public class GuGuDanTest {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int dan = 1; dan <= 9; dan++) {
				System.out.print(dan + "*" + i + "=" + dan * i +"\t");
			}
			System.out.println();
		}

	}

}
