package icehs.science.chapter03;

public class StringTest {

	public static void main(String[] args) {
	
    String name = "홍길동";
    String department = "도서관";
    String mathScore = "86";
    int intMathScore = Integer.parseInt(mathScore) +1;
    
    System.out.println(name);
    System.out.println(department);
    
    System.out.println(name + department);
    System.out.println(name + " : " + department);
    System.out.println("수학점수 :" + mathScore + 1);
    System.out.println("수학점수 :" + intMathScore);

	}

}
