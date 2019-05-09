package dreamschool.cscourse.chapter07;

public class ItBookTest {

	public static void main(String[] args) {
		ItBook book1 = new ItBook("SQL Plus", 55000, 5.5);
		ItBook book2 = new ItBook("Java 2.0", 28000, 3.2);
		ItBook book3 = new ItBook("JSP Serlet", 37000, 6.9);
		
		book1.printItBookInfo();
		book2.printItBookInfo();
		book3.printItBookInfo();
	
		System.out.println();
		System.out.println(" 정가와 할인율을 변경합니다.");
		book1.setTitle("SQL Plus");
		book1.setPrice(55000);
		book1.setDiscountRate(9.5);
		book1.printItBookInfo();
		
		System.out.println();
		System.out.println("Java 2.0 정가를 변경합니다.");
		book1.setTitle("Java 2.0");
		book1.setPrice(33000);
		book1.setDiscountRate(3.2);
		book1.printItBookInfo();
				
		System.out.println();
		System.out.println("SQL Plus 제목과 할인율을 변경합니다.");
		book1.setTitle("Serlet & JSP");
		book1.setPrice(37000);
		book1.setDiscountRate(12.6);
		book1.printItBookInfo();
		
	}

}
