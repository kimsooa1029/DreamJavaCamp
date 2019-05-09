package dreamschool.cscourse.chapter10.heroes;

public class HeroTest {

	public static void main(String[] args) {
		Hero[] heroes = {
				new SuperMan(), new BatMan(), new SpiderMan()
		};
		
		System.out.println("Hero ¸ñ·Ï : " + heroes[0] + ", " + heroes[1] +
				", " + heroes[2]);
		
		System.out.println();
		
		for(Hero hero : heroes) {
			hero.action();
		}

	}

}
