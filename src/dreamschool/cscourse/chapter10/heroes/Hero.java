package dreamschool.cscourse.chapter10.heroes;

public class Hero implements CanFly, CanSwim, CanFight {

	@Override
	public void fight() {
		System.out.println("싸운다.");
		
	}

	@Override
	public void swim() {
		System.out.println("헤엄친다.");
		
	}

	@Override
	public void fly() {
		System.out.println("난다.");
		
	}
	
	public void action() {
		
	}

}
