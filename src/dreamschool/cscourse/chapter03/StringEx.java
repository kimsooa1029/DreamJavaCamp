package dreamschool.cscourse.chapter03;

public class StringEx {

	public static void main(String[] args) {
		String name = "¼¼Á¾´ë¿Õ";
		String tenThousand = "10000";
		int thisYear = 2019;
		int intTenTousand = Integer.parseInt(tenThousand);
		String yesno = "true";
		boolean booleanYesNo = Boolean.parseBoolean(yesno);
		
		System.out.println(name + ":" + tenThousand);
		System.out.println(thisYear + "³â");
		System.out.println(tenThousand + thisYear);
		System.out.println(thisYear + intTenTousand);
		System.out.println(!booleanYesNo);
		
	}

}
