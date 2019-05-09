package dreamschool.cscourse.chapter07;

public class StudentTest {

	public static void main(String[] args) {
		Student.printTitle();
		System.out.println(Student.COURSE);
		
		Student stu1 = new Student();
		stu1.printTitle();
		System.out.println(stu1.id);
		//stu1.COURSE = "25";
		System.out.println(stu1.COURSE);

	}

}
