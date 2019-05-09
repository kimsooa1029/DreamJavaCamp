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
		//return은 void일때를 제외하고 무조건 넣어야한다.
		}
	
	void printStudentInfo() {
		System.out.println("학생명" + studentName);
		System.out.println("학번" + studentId);
		System.out.println("국어점수" + korean);
		System.out.println("영어점수" + english);
		System.out.println("수학점수" + math);
		System.out.println("평균점수" + (int)calculateAverage());
	}
	
	void changeStudentId(String newId) {
		studentId = newId;
	}
	
}
