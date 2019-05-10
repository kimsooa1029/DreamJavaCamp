package dreamschool.cscourse.chapter11;

import java.util.ArrayList;

public class BookLIstTest {
	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();
		list.add(new Book("Java의 정석", 346, 15000));
		list.add(new Book("Oracle 11g", 560, 18000));
		list.add(new Book("JSP 따라하기", 271, 12000));
		
		Book book2 = list.get(1);
		book2.setPage(100);
		
		
		
		for(int i = 0; i < list.size(); i++) {
			Book book = list.get(i);
			System.out.println((i+1) + "." + book.getTitle() + " (" +
					book.getPage() + "page) : " +book.getPrice() + " 원");
		
		}
		
	}

}