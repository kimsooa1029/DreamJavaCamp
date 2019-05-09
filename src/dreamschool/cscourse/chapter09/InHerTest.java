package dreamschool.cscourse.chapter09;

public class InHerTest {
	public static void main(String[] args) {
		Student stu = new Student("홍길동", "123-4567", "컴퓨터 공학과");
		Teacher tea = new Teacher("홍길순", "111-1111", "생명 공학과");
		Person per = new Person("홍길동", "222-2222");
		
		System.out.println("===== Person =====");
		per.eat();
		per.sleep();
		
		System.out.println("===== Student =====");
		stu.study();
		stu.eat();
		
		System.out.println("===== Teacher =====");
		tea.teach();
		tea.eat();
		
	}

}
