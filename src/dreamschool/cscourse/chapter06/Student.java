package dreamschool.cscourse.chapter06;

public class Student {
	String studentName;
	String studentId;
	double korean;
	double english;
	double math;
	
	double calculateAverage() {
		double avg = (korean + english + math) / (double)3;
		return avg;
		//return�� void�϶��� �����ϰ� ������ �־���Ѵ�.
		}
	
	void printStudentInfo() {
		System.out.println("�л���" + studentName);
		System.out.println("�й�" + studentId);
		System.out.println("��������" + korean);
		System.out.println("��������" + english);
		System.out.println("��������" + math);
		System.out.println("�������" + (int)calculateAverage());
	}
	
	void changeStudentId(String newId) {
		studentId = newId;
	}
	
}