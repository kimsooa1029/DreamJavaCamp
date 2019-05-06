package dreamschool.cscourse.chapter05;

public class GuGuDanBreakTest {

	public static void main(String[] args) {
		for (int dan = 2; dan <=9; dan++) {
			for (int i = 1; i <= 9 ; i++) {
				if (i == 5) {
					continue ;
				} 
				System.out.print(dan + "*" + i + "=" + dan * i + "\t");
			    
				System.out.println();
			}
		}
	}
}
