package dreamschool.cscourse.chapter11;

public class Book {
	private String title;
	private int page;
	private int price;
	
	public Book(String title, int page, int price) {
		this.title = title;
		this.page = page;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
