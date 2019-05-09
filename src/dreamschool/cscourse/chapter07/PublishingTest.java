package dreamschool.cscourse.chapter07;

public class PublishingTest {

	public static void main(String[] args) {
		Publication book1 = new Publication();
		Publication book2 = new Publication();
		
		//System.out.println(book1);
		//System.out.println(book2);
		
		System.out.println("===== 출판물 정보를 세팅합니다. =====");
		book1.setTitle("만화 삼국지");
		book1.setPrice(-10000);
		book1.setPrice(12000);
		book1.setPage(300);
		book1.setPage(-250);
		
		System.out.println("출판물 정보 :" + book1.getTitle() + "("
				+book1.getPrice() + "원, " + book1.getPage() + "page)");

	}

}
