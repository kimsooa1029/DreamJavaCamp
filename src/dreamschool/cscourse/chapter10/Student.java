package dreamschool.cscourse.chapter10;

public class Student extends Person{
	private String department;
	
	public Student(String name, String phoneNumber, String department) {
		super(name, phoneNumber);
		this.department = department;
	}
	

	public void study() {
		System.out.println("공부를 해요.");
	}
	@Override
	public void eat() {
		super.eat();
		System.out.println("조별로 먹어요.");
	}

}
