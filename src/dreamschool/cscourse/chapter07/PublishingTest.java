package dreamschool.cscourse.chapter07;

public class PublishingTest {

	public static void main(String[] args) {
		Publication book1 = new Publication();
		Publication book2 = new Publication();
		
		//System.out.println(book1);
		//System.out.println(book2);
		
		System.out.println("===== ���ǹ� ������ �����մϴ�. =====");
		book1.setTitle("��ȭ �ﱹ��");
		book1.setPrice(-10000);
		book1.setPrice(12000);
		book1.setPage(300);
		book1.setPage(-250);
		
		System.out.println("���ǹ� ���� :" + book1.getTitle() + "("
				+book1.getPrice() + "��, " + book1.getPage() + "page)");

	}

}
