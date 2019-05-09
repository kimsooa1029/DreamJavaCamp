package dreamschool.cscourse.chapter10.heroes;

public class SpiderMan extends Hero{
	@Override
	public void action() {
		System.out.print(this.toString() + "이 ");
		fight();
		
		
	}
	@Override
	public String toString() {
		return "스파이더맨";
	}


}
