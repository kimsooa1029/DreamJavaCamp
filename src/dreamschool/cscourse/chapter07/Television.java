package dreamschool.cscourse.chapter07;

public class Television {
	String name;
	String description;
	int price;
	
	public Television(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public Television(String name, int price, String description) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	void printTelevisionInfo() {
		if(description != null) {
			System.out.println(this.name + "(" + this.description + ") : " +this.price);
		}else {
			System.out.println(this.name + " : " +this.price);	
		}
	}	
}
