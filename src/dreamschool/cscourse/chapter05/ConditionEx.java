package dreamschool.cscourse.chapter05;

public class ConditionEx {

	public static void main(String[] args) {
		int age = 20;
		
		if (age < 19) {
			System.out.println("19세 이상만 입장");
			System.out.println("죄송합니다.");
		}
		
		if (age > 19) {
			System.out.println("성인입니다.");
			System.out.println("입장하세요.");
		}

	}

}
