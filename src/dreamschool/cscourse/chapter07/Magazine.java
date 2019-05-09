package dreamschool.cscourse.chapter07;

public class Magazine {
	private int price;
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	int discountPrice(int rate) {
		return (int)price * (100 - rate) / 100;
	}

}
