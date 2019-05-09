package dreamschool.cscourse.chapter08;

public class StudentArrayTest {

	public static void main(String[] args) {
		Student [] students = {new Student ("±è¼ö¾Æ", "STU0001", "010-3333-4444"), 
								new Student("ÀÌ¼­Áø", "STU0002", "010-1111-2222"),
								new Student("±è³ë¾Æ", "STU0003", "010-0000-0000")
		};
		
		for(int i = 0; i < students.length; i ++) {
			students[i].printStudentInfo();
		}

	}
	}
