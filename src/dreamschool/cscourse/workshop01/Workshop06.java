package dreamschool.cscourse.workshop01;

public class Workshop06 {

	public static void main(String[] args) {
		int mydan = 9;
		for (int i = 1; i <= 9; i++) {
			for (int dan = 2; dan <= mydan; dan ++) {
				int result = dan * i;
				if (mydan == 9) {
					System.out.print(dan + " * " + i + " = " + result + "\t");
				} else {
					System.out.print(dan + " * " + i + " = " + result + "," + "\t");}
				}	
			System.out.println();
		    }
		    
		}
	}
