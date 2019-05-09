package dreamschool.cscourse.chapter09;

public class Dentist extends Doctor{

	public Dentist(String name, String department) {
		super(name, "치과");
		
	}
	public void pullOutTooth() {
		System.out.println("이를 뽑습니다.");
	}
	
	
	

}
