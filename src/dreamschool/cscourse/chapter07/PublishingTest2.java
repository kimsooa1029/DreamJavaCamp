package dreamschool.cscourse.chapter07;

public class PublishingTest2 {

	public static void main(String[] args) {
		Publication book1 = new Publication("��ȭ �ﱹ��", 5000, 300);
		Publication book2 = new Publication("���� �̾߱�", 8400, 200);
		
		Publication.printHeader();
		book1.printBookInfo();
		book2.printBookInfo();

	}

}
