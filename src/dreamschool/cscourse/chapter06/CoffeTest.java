package dreamschool.cscourse.chapter06;

public class CoffeTest {

	public static void main(String[] args) {
		Coffee ame = new Coffee();
		ame.name = "�Ƹ޸�ī��";
		ame.price = 3500;
		ame.printCoffeeInfo();
		
		Coffee latte = new Coffee();
		latte.name = "ī���";
		latte.price = 4000;
		latte.printCoffeeInfo();
		
		Coffee maki = new Coffee();
		maki.name = "��Ű�ƶ�";
		maki.price = 4500;
		maki.printCoffeeInfo();
		
		System.out.println("�ѱݾ� :" + (latte.price + maki.price + ame.price));
	}

}
