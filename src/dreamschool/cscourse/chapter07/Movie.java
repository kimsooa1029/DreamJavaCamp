package dreamschool.cscourse.chapter07;

public class Movie {
	String title;
	String director;
	String genre;
	
	public Movie() {
	}
	public Movie(String title, String director) {
		this.title = title;
		this.director = director;
	}
	public Movie(String title, String director, String genre) {
		this.title = title;
		this.director = director;
		this.genre = genre;
		
	}
}
