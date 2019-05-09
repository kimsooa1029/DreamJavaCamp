package dreamschool.cscourse.chapter08;

public class Student {
	private String name;
	private String studentId;
	private String PhoneNum;
	
	public Student(String name, String studentId, String phoneNum) {
		this.name = name;
		this.studentId = studentId;
		PhoneNum = phoneNum;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getPhoneNum() {
		return PhoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}
	
	public void printStudentInfo() {
		System.out.println(this.name + "(" + this.studentId + ") / 전화번호 :" + this.PhoneNum);
	}
	
	

}
