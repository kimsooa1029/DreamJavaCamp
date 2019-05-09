package dreamschool.cscourse.workshop02;

public class Book {
    
    private String isbn;
    private String title;
    private String author;
    private int    price;
    private String issueDate;
    
    public Book( String title, String author) {
        this.title  = title;
        this.author = author;
    }
    public Book( String isbn, String title, String author, int price) {
    	this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
    }
	public Book(String isbn, String title, String author, int price, String issueDate) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		this.issueDate = issueDate;
	}
    
    public String getIsbn() {
        return isbn;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void printBookInfo() {
        
        System.out.print( "[제목] " + title + "\t[저자] " + author );
        
        if ( price > 0 ) {
            System.out.print( "\t[가격] " + price );
        }
        
        if ( issueDate != null ) {
            System.out.print( "\t[발행일] " );
            printDate( issueDate );
        }
        
        System.out.println();
    }
    
    private void printDate( String date ) {
        //TODO YYYY-MM-DD 형식으로 저장되어 있는 날짜 정보를 YYYY년 MM월 DD일 형식으로 변경하여 출력하시오.
        
    }
}