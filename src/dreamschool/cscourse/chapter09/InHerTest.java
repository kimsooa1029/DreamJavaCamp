package dreamschool.cscourse.chapter09;

public class InHerTest {
	public static void main(String[] args) {
		Student stu = new Student("ȫ�浿", "123-4567", "��ǻ�� ���а�");
		Teacher tea = new Teacher("ȫ���", "111-1111", "���� ���а�");
		Person per = new Person("ȫ�浿", "222-2222");
		
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
