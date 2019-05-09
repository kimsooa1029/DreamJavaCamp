package dreamschool.cscourse.chapter06;

public class CoffeTest {

	public static void main(String[] args) {
		Coffee ame = new Coffee();
		ame.name = "아메리카노";
		ame.price = 3500;
		ame.printCoffeeInfo();
		
		Coffee latte = new Coffee();
		latte.name = "카페라떼";
		latte.price = 4000;
		latte.printCoffeeInfo();
		
		Coffee maki = new Coffee();
		maki.name = "마키아또";
		maki.price = 4500;
		maki.printCoffeeInfo();
		
		System.out.println("총금액 :" + (latte.price + maki.price + ame.price));
	}

}
