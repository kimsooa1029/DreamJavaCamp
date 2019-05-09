package dreamschool.cscourse.chapter07;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("해리포터", 8000);
		book1.printBookInfo();
		book2.printBookInfo();
		
		/*객체를 저장해서 쓰면 아무런 값을 넣지 않아도 없는 값이 나온다.
		*         (0, 0.0, null)
		*/

	}

}
