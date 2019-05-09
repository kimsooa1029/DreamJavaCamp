package dreamschool.cscourse.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.studentName = "홍길동";
		stu.studentId = "S001";
		stu.korean = 94;
		stu.english = 80;
		stu.math = 89;
		
		stu.printStudentInfo();
		System.out.println("* 학번을 변경합니다!!!");
		stu.changeStudentId("STU0001");
		stu.printStudentInfo();
		

	}

}
