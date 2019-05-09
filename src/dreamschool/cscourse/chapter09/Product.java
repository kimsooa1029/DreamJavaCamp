package dreamschool.cscourse.chapter09;

public class Product {
	private String name;
	private int price;
	private int discountRate;
	
	
	public Product(String name, int price, int discountRate) {
		this.name = name;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	public void printProductInfo() {
		System.out.println("======= 제품 정보 =======");
		System.out.println("제품명 : " + this.name);
		System.out.println("정가 :" + this.price + "원 (" + this.discountRate + "%)");
		System.out.println("판매가 :" + this.calculationDiscountPrice() + "원");
	}
	
	public int calculationDiscountPrice() {
		int totalPrice = this.price * (100 - this.discountRate) / 100;
		return totalPrice;
	}
	

}
