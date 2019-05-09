package dreamschool.cscourse.chapter10;

public class AnimlTest {
	public static void main(String[] args) {
		Animal bird1 = new Bird("독수리", 3, "바위산둥");
		System.out.println(bird1.getKind() + "(" + bird1.getAge() + "살) :" +
				((Bird)bird1).getHabitat());
		
		((Bird)bird1).spreadWings();
		((Bird)bird1).fly();
		
		Flyable bird2 = new Bird("독수리", 3, "바위산둥");
		System.out.println(((Bird)bird2).getKind() + "(" + ((Bird)bird2).getAge() + "살) :" +
				((Bird)bird2).getHabitat());
		
		bird2.spreadWings();
		bird2.fly();
	}

}
